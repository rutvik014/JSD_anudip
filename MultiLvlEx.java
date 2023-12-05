public class MultiLvlEx {
    public static void main(String[] args) {
        // Superclass (Parent class)
        class Sp implements Spt {
            public void play() {
                System.out.println("Playing a sport.");
            }
        }

        // First Subclass
        class Tm extends Sp {
            public void teamwork() {
                System.out.println("Emphasizing teamwork in a team sport.");
            }
        }

        // Second Subclass
        class Bt extends Tm {
            public void shoot() {
                System.out.println("Shooting the basketball.");
            }
        }

        // Create an instance of the Bt class
        Bt game = new Bt();

        // Step 1: Instance of Bt is created, which is a subclass of Tm
        // Step 2: The play method of the Sp class (inherited by Tm) is called
        game.play();      // Output: Playing a sport.

        // Step 3: The teamwork method of the Tm class is called
        game.teamwork();  // Output: Emphasizing teamwork in a team sport.

        // Step 4: The shoot method of the Bt class is called
        game.shoot();     // Output: Shooting the basketball.
    }
}

// Interface with a short name for common behavior
interface Spt {
    void play();
}
