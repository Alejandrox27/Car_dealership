package org.example;

import org.example.Logic.CarService;
import org.example.Logic.ICarService;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ICarService service = new CarService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car dealership");
        System.out.println("Here you can find all the cars of any brand you want");

        boolean continue_ = true;
        while(continue_) {

            System.out.println("Choose the option you want to see:");
            System.out.printf(
                            "1. Show all the cars ordered by price%n" +
                            "2. Show cars ordered by brand and price%n" +
                            "3. Filter cars by a price range%n" +
                            "4. filter by brand%n" +
                            "5. Filter by letter or name%n" +
                                    "6. Exit program%n>> "
            );

            int option;
            try {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        service.showCarsOrderedByPrice();
                        continueList();
                        break;
                    case 2:
                        service.showCarsOrderedByBrandAndPrice();
                        continueList();

                        break;
                    case 3:
                        System.out.printf("Insert a max range of price:%n>> ");
                        double price = 0;
                        try {
                            price = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }

                        if (price <= 0) {
                            service.showCarsOrderedByPrice();
                            break;
                        }

                        service.getCarsBelowPrice(price);
                        continueList();

                        break;
                    case 4:
                        System.out.printf("Write the brands you want to see with commas:%n>> ");
                        String brands = "";
                        try {
                            brands = scanner.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }

                        List<String> brandsList = new ArrayList<>(Arrays.asList(brands.split(",")));

                        service.filterCarsByBrand(brandsList);
                        continueList();

                        break;
                    case 5:
                        System.out.printf("Choose a letter or model to search in models:%n>> ");
                        String search = "";
                        try {
                          search = scanner.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }

                        service.showModelsWithLetter(search);
                        continueList();

                        break;
                    case 6:
                        continue_ = false;
                        break;
                    default:
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }


        }

    }

    public static void continueList () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Push enter to continue");
        scanner.nextLine();
    }
}
