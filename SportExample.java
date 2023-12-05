public class SportExample {
    public static void main(String[] args) {
        // Superclass (Parent class)
        class Sport {
            void play() {
                System.out.println("Playing a sport.");
            }
        }

        // Subclass (Child class)
        class Football extends Sport {
            void kick() {
                System.out.println("Kicking the football.");
            }
        }

        // Create an instance of the Football class
        Football match = new Football();

        // Step 1: Instance of Football is created, which is a subclass of Sport
        // Step 2: The play method of the Sport class is inherited and called
        match.play();   // Output: Playing a sport.

        // Step 3: The kick method of the Football class is called
        match.kick();   // Output: Kicking the football.
    }
}
