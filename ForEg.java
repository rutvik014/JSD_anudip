import java.util.Scanner;

class ForEg {
    void calc_Table(int number) {
        char status;
        Scanner sc = new Scanner(System.in); // Move the scanner declaration inside the method.

        do {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value is: " + (number * i));
            }

            System.out.println("Do you want to continue? (Y/N) ");
            status = sc.next().charAt(0); // Use next() to read a String and then get the first character.

        } while (status == 'Y');

        System.out.println("Goodbye!");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        ForEg e = new ForEg();
        e.calc_Table(number);
    }
}
