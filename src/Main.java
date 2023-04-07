import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        inventory.addCar("SS7", 80000, 155, 240, 5, new CarSpec("Sedan", "Electric", "Automatic", "Red"));
        inventory.addCar("Ladx", 50000, 140, 240, 5, new CarSpec("Sedan", "Electric", "Automatic", "White"));
        inventory.addCar("Model X", 95000, 155, 240, 7, new CarSpec("SUV", "Electric", "Automatic", "Black"));
        inventory.addCar("Model Y", 60000, 140, 240, 7, new CarSpec("SUV", "Electric", "Automatic", "Blue"));
        inventory.addCar("Aventador", 400000, 217, 17, 2, new CarSpec("Coupe", "Gasoline", "Automatic", "Yellow"));
        inventory.addCar("Huracan", 260000, 202, 17, 2, new CarSpec("Coupe", "Gasoline", "Automatic", "Black"));
        inventory.addCar("Range Rover", 90000, 130, 23, 5, new CarSpec("SUV", "Diesel", "Automatic", "Green"));
        inventory.addCar("X5", 60000, 155, 23, 5, new CarSpec("SUV", "Diesel", "Automatic", "White"));

        System.out.print("Enter body type: ");
        String bodyType = scanner.nextLine();
        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine();
        System.out.print("Enter transmission: ");
        String transmission = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        List<Car> matchingCars = inventory.search(bodyType, engineType, transmission, color);

        if (matchingCars.size() > 0) {
            System.out.println("Matching cars:");
            for (Car car : matchingCars) {
                System.out.println(car.getModel() + " - " + car.getPrice() + " - " + car.getMaxSpeed() + " - " +
                        car.getFuelBurn() + " - " + car.getPassengersNum() + " - " + car.getSpec().getBodyType() +
                        " - " + car.getSpec().getEngineType() + " - " + car.getSpec().getTransmission() + " - " +
                        car.getSpec().getColor());
            }
        } else {
            System.out.println("No matching cars found.");
        }

        scanner.close();
    }
}

