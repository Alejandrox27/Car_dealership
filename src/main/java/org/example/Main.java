package org.example;

import org.example.Logic.CarService;
import org.example.Logic.ICarService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ICarService service = new CarService();
        System.out.println(" Car dealership ");
        service.showCarsOrderedByPrice();
    }
}
