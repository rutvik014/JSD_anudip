public class ArrowPattern {
    public static void main(String[] args) {
        int height = 15; // You can change the height as needed
        createArrowPattern(height);
    }

    public static void createArrowPattern(int height) {
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

        // Print the body of the arrow
        for (int i = 1; i <= height / 2; i++) {
            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
