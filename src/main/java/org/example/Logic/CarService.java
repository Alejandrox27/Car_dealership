package org.example.Logic;

import org.example.db_cars.CarRepository;
import org.example.db_cars.connection;
import org.example.model.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements ICarService{
    private final connection repo = new connection();

    private List<Car> internalList;

    public CarService () {
        this.internalList = repo.findAll();
    }

    public void refreshData () {
        // refresh data if something changes in the database
        this.internalList = repo.findAll();
    }

    @Override
    public void showCarsOrderedByPrice() {
        internalList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .forEach(System.out::println);
    }

    @Override
    public void showCarsOrderedByBrandAndPrice() {
        internalList.stream()
                .sorted(Comparator.comparing(Car::getBrand).thenComparing(Car::getPrice))
                .forEach(System.out::println);
    }

    @Override
    public List<Car> getCarsBelowPrice(double maxPrice) {

        return internalList.stream()
                .filter(car -> car.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> filterCarsByBrand(List<String> brands) {

        return internalList.stream()
                .filter(car -> brands.contains(car.getBrand()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> showModelsWithLetter(String letter) {

        return internalList.stream()
                .filter(car -> car.getModel().toLowerCase().contains(letter))
                .collect(Collectors.toList());
    }
}
