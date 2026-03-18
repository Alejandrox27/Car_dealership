package org.example.db_cars;
import org.example.model.Car;
import java.util.List;
import java.util.ArrayList;

public class CarRepository {
    private List<Car> carDatabase;

    public void carRepository () {
        this.carDatabase = new ArrayList<>();
        loadInitialData();
    }

    public void loadInitialData () {
        carDatabase.add(new Car("Volkswagen", "Amarok", 25000));
        carDatabase.add(new Car("Volkswagen", "Taos", 32000));
        carDatabase.add(new Car("Chevrolet", "Onix", 22000));
        carDatabase.add(new Car("Chevrolet", "Tracker", 30000));
        carDatabase.add(new Car("Fiat", "Cronos", 21000));
        carDatabase.add(new Car("Fiat", "Pulse", 24000));
        carDatabase.add(new Car("Toyota", "Corolla", 28000));
        carDatabase.add(new Car("Toyota", "Yaris", 23000));
        carDatabase.add(new Car("Renault", "Stepway", 20000));
        carDatabase.add(new Car("Renault", "Duster", 27000));
        carDatabase.add(new Car("Nissan", "Versa", 25000));
    }

    public List<Car> findAll() {
        return new ArrayList<>(carDatabase);
    }
}
