package org.example.Logic;
import org.example.model.Car;
import java.util.List;

public interface ICarService {
    void showCarsOrderedByPrice();
    void showCarsOrderedByBrandAndPrice();
    List<Car> getCarsBelowPrice(double maxPrice);
    List<Car> filterCarsByBrand(List<String> brands);
    void showModelsWithLetterA();
}
