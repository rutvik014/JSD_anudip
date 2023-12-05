public class HumanicalPattern {
    public static void main(String[] args) {
        int height = 7; // You can change the height as needed

        for (int i = 1; i <= height; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the first part
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // Print the body of the humanical
        for (int i = 1; i <= height / 2; i++) {
            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
