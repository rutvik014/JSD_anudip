import java.util.Scanner;

class Car {
    String make;
    String model;
    short year;
    int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a car
        System.out.println("Enter make:");
        String make = scanner.nextLine();
        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter year:");
        short year = scanner.nextShort();
        System.out.println("Enter price:");
        int price = scanner.nextInt();

        // Create a Car object
        Car car = new Car(make, model, year, price);

        // Display the details of the car
        System.out.println("\nCar Details:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Price: $" + car.price);

        scanner.close();
    }
}
