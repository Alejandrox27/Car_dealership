package org.example.model;

public class Car {
    final private String BRAND;
    final private String MODEL;
    final private double PRICE;

    public Car (String brand, String model, double price) {
        this.BRAND = brand;
        this.MODEL = model;
        this.PRICE = price;
    }

    public String getBrand() {
        return BRAND;
    }

    public String getModel() {
        return MODEL;
    }

    public double getPrice () {
        return PRICE;
    }

    public String toString () {
        return "Car {model = " + MODEL +
                ", brand = " + BRAND +
                ", price = " + PRICE +
                "}";
    }

}
