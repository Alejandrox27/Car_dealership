package org.example.db_cars;
import org.example.model.Car;
import java.util.List;
import java.util.ArrayList;

public class CarRepository {
    final private List<Car> carDatabase;

    public CarRepository () {
        this.carDatabase = new ArrayList<>();
        loadInitialData();
    }

    public void loadInitialData () {
        carDatabase.add(new Car(1,"Volkswagen", "Amarok", 25000));
        carDatabase.add(new Car(2,"Volkswagen", "Taos", 32000));
        carDatabase.add(new Car(3,"Chevrolet", "Onix", 22000));
        carDatabase.add(new Car(4,"Chevrolet", "Tracker", 30000));
        carDatabase.add(new Car(5,"Fiat", "Cronos", 21000));
        carDatabase.add(new Car(6,"Fiat", "Pulse", 24000));
        carDatabase.add(new Car(7,"Toyota", "Corolla", 28000));
        carDatabase.add(new Car(8,"Toyota", "Yaris", 23000));
        carDatabase.add(new Car(9,"Renault", "Stepway", 20000));
        carDatabase.add(new Car(10,"Renault", "Duster", 27000));
        carDatabase.add(new Car(11,"Nissan", "Versa", 25000));
    }

    public List<Car> findAll() {
        return new ArrayList<>(carDatabase);
    }
}
