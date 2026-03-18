package org.example.Logic;

import org.example.db_cars.CarRepository;
import org.example.model.Car;

import java.util.Comparator;
import java.util.List;

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

    }

    @Override
    public List<Car> getCarsBelowPrice(double maxPrice) {
        return List.of();
    }

    @Override
    public List<Car> filterCarsByBrand(List<String> brands) {
        return List.of();
    }

    @Override
    public void showModelsWithLetterA() {

    }
}
