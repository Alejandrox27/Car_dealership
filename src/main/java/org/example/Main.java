package org.example;

import org.example.Logic.CarService;
import org.example.Logic.ICarService;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ICarService service = new CarService();
        System.out.println(" Car dealership ");
        System.out.println(service.getCarsBelowPrice(23000));
        System.out.println(service.filterCarsByBrand(List.of("Toyota", "Chevrolet")));
        service.showModelsWithLetterA();
    }
}
