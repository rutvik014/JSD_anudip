import java.util.Scanner;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for integers
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Get user input for doubles
        System.out.println("Enter two doubles:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        // Create Calculator object
        Calculator calculator = new Calculator();

        // Display results
        System.out.println("\nResult of adding two integers: " + calculator.add(num1, num2));
        System.out.println("Result of adding three integers: " + calculator.add(num1, num2, num1));
        System.out.println("Result of adding two doubles: " + calculator.add(double1, double2));

        scanner.close();
    }
}
