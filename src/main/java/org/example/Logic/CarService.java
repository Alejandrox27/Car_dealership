package org.example.Logic;

import org.example.db_cars.CarRepository;
import org.example.model.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CarService implements ICarService{
    private CarRepository repo = new CarRepository();

    @Override
    public void showCarsOrderedByPrice() {
        repo.findAll().stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .forEach(System.out::println);
    }

    @Override
    public void showCarsOrderedByBrandAndPrice() {
        repo.findAll().stream()
                .sorted(Comparator.comparing(Car::getBrand).thenComparing(Car::getPrice))
                .forEach(System.out::println);
    }

    @Override
    public List<Car> getCarsBelowPrice(double maxPrice) {
        List<Car> cars = repo.findAll().stream()
                .filter(car -> car.getPrice() < maxPrice)
                .collect(Collectors.toList());

        return cars;
    }

    @Override
    public List<Car> filterCarsByBrand(List<String> brands) {
        List<Car> cars = repo.findAll().stream()
                .filter(car -> brands.contains(car.getBrand()))
                .collect(Collectors.toList());

        return cars;
    }

    @Override
    public List<Car> showModelsWithLetter(String letter) {
        List<Car> cars = repo.findAll().stream()
                .filter(car -> car.getModel().toLowerCase().contains(letter))
                .collect(Collectors.toList());

        return cars;
    }
}
