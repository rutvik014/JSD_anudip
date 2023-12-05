public class Rectangle{

    public static void main(String[] args) {
        // Let's imagine we have two rectangles with different sizes.
        int length1 = 15;
        int width1 = 16;

        int length2 = 7;
        int width2 = 5;

        // Calculate the areas of the rectangles.
        int area1 = length1 * width1;
        int area2 = length2 * width2;

        // Compare the areas using simple language.
        if (area1 > area2) {
            System.out.println("The first rectangle is bigger!");
        } else if (area1 < area2) {
            System.out.println("The second rectangle is bigger!");
        } else {
            // If the areas are the same, explain it with a simple message.
            System.out.println("Both rectangles are the same size.");
            System.out.println("Explanation: Imagine I am 5 years old!");
        }
    }
}
