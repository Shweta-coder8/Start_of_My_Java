import java.util.*;

class Vehicle {
    String manufacturer;
    String model;
    int year;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;
    double price;

    public void inputCarDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fuel type: ");
        fuelType = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public void showCarDetails() {
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Price: " + price);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("----CAR DETAILS----");
        Car c = new Car();
        c.inputDetails();
        c.inputCarDetails();
        c.showDetails();
        c.showCarDetails();
    }
}
