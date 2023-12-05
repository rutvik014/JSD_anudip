// parent class
class Animal {
    // parent properties
    String name;
    String color;
    String food;
    String natureOfLiving;
    int noOfLegs;
}

// first child class
class Carnivorous extends Animal {
    // child properties
    String strength;
    String hunting;

    // New property for Carnivorous
    String habitat;

    void display() {
        System.out.println(name + " " + color + " " + food + " " + natureOfLiving + " " + noOfLegs); // parent properties
        System.out.println(strength + " " + hunting + " " + habitat); // child properties
    }
}

// second child class
class Herbivores extends Animal {
    // child properties
    String grazing;
    String hunt;

    // New property for Herbivores
    String habitat;

    void display() {
        System.out.println(name + " " + color + " " + food + " " + natureOfLiving + " " + noOfLegs); // parent properties
        System.out.println(grazing + " " + hunt + " " + habitat); // child properties
    }
}

// main class
class InheritanceExample {

    // entry point
    public static void main(String args[]) {
        Carnivorous c = new Carnivorous();
        c.name = "Lion";
        c.color = "Yellow";
        c.food = "Meat";
        c.natureOfLiving = "Terrestrial";
        c.noOfLegs = 4;
        c.strength = "Powerful jaws";
        c.hunting = "Active";
        c.habitat = "Grasslands";

        Herbivores h = new Herbivores();
        h.name = "Giraffe";
        h.color = "Brown";
        h.food = "Plants";
        h.natureOfLiving = "Terrestrial";
        h.noOfLegs = 4;
        h.grazing = "Frequent";
        h.hunt = "Passive";
        h.habitat = "Savanna";

        // Displaying information
        c.display();
        h.display();
    }
}
