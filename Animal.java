// parent class
class Animal {
    // parent properties
    String species;
    String color;
    String diet;
    String habitat;
    int numberOfLegs;
}

// first child class
class Carnivorous extends Animal {
    // child properties
    String huntingStyle;
    String preferredPrey;

    // New properties for Carnivorous
    boolean isApexPredator;
    int averageLifespan;

    void display() {
        System.out.println(species + " " + color + " " + diet + " " + habitat + " " + numberOfLegs); // parent properties
        System.out.println(huntingStyle + " " + preferredPrey + " " + isApexPredator + " " + averageLifespan); // child properties
    }
}

// second child class
class Herbivores extends Animal {
    // child properties
    String grazingStyle;
    String favoriteFood;

    // New properties for Herbivores
    boolean migrates;
    String socialStructure;

    void display() {
        System.out.println(species + " " + color + " " + diet + " " + habitat + " " + numberOfLegs); // parent properties
        System.out.println(grazingStyle + " " + favoriteFood + " " + migrates + " " + socialStructure); // child properties
    }
}

// main class
class InheritanceExample {

    // entry point
    public static void main(String args[]) {
        Carnivorous lion = new Carnivorous();
        lion.species = "Lion";
        lion.color = "Yellow";
        lion.diet = "Meat";
        lion.habitat = "Grasslands";
        lion.numberOfLegs = 4;
        lion.huntingStyle = "Ambush";
        lion.preferredPrey = "Antelope";
        lion.isApexPredator = true;
        lion.averageLifespan = 15;

        Herbivores giraffe = new Herbivores();
        giraffe.species = "Giraffe";
        giraffe.color = "Brown";
        giraffe.diet = "Plants";
        giraffe.habitat = "Savanna";
        giraffe.numberOfLegs = 4;
        giraffe.grazingStyle = "Browsing";
        giraffe.favoriteFood = "Acacia leaves";
        giraffe.migrates = false;
        giraffe.socialStructure = "Herd";

        // Displaying information
        lion.display();
        giraffe.display();
    }
}
