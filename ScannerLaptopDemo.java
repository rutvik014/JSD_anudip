import java.util.Scanner;

public class  ScannerLaptopDemo
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter two numbers to be added:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("The result is " + sum);
                    break;

                case 2:
                    System.out.println("Enter two numbers to be subtracted:");
                    int minuend = scanner.nextInt();
                    int subtrahend = scanner.nextInt();
                    int difference = minuend - subtrahend;
                    System.out.println("The result is " + difference);
                    break;

                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                    int multiplicand = scanner.nextInt();
                    int multiplier = scanner.nextInt();
                    int product = multiplicand * multiplier;
                    System.out.println("The result is " + product);
                    break;

                case 4:
                    System.out.println("Enter a number to check if it's even or odd:");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("The number is even.");
                    } else {
                        System.out.println("The number is odd.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option (1-5).");
            }
        } while (option != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Enter Option:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Even/Odd Number");
        System.out.println("5 - Quit");
    }
}
