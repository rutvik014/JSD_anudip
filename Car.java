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
        // Create a supercar object
        Car supercar = new Car("Ferrari", "LaFerrari", (short) 2023, 3000000);

        // Create a sports car object
        Car sportsCar = new Car("Porsche", "911", (short) 2023, 150000);

        // Display the details of the supercar
        System.out.println("Supercar Details:");
        displayCarDetails(supercar);

        // Display the details of the sports car
        System.out.println("\nSports Car Details:");
        displayCarDetails(sportsCar);
    }

    // Method to display car details
    private static void displayCarDetails(Car car) {
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Price: $" + car.price);
    }
}
