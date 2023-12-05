import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Take basic salary input from the user
            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate HRA and DA based on conditions
            double hra, da;
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }

            // Calculate gross salary
            double grossSalary = basicSalary + hra + da;

            // Display the gross salary
            System.out.println("Gross Salary: " + grossSalary);

            // Ask for user's choice
            System.out.print("Enter '-1' to exit, or any other number to continue: ");
            choice = scanner.nextInt();

        } while (choice != -1);

        System.out.println("Program exited. TATA!");
        scanner.close();
    }
}
