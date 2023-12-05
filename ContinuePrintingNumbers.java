import java.util.Scanner;

public class ContinuePrintingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        int startNumber = 1;
        int numberOfNumbersToPrint = 50;

        do {
            // Print a series of numbers
            for (int i = startNumber; i < startNumber + numberOfNumbersToPrint; i++) {
                System.out.println(i);
            }

            System.out.print("Do you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                startNumber += numberOfNumbersToPrint; // Increment the starting number
            }
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Goodbye!");
        scanner.close();
    }
}
