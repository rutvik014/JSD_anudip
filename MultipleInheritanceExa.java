public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Give specific values for the Child class properties
        String childName = "Alice";
        String childSurname = "Smith";
        int childAge = 8;
        int childHeight = 110;
        int childWeight = 25;
        String schoolName = "XYZ School";
        int passoutYear = 2027;

        // Create an instance of the Child class with specific values
        Child alice = new Child(childName, childSurname, childAge, childHeight, childWeight, schoolName, passoutYear);

        // Access and print parent properties using child instance
        System.out.println("Name: " + alice.getName());
        System.out.println("Surname: " + alice.getSurname());
        System.out.println("Age: " + alice.getAge());
        System.out.println("Height: " + alice.getHeight());
        System.out.println("Weight: " + alice.getWeight());

        // Introduce the child
        alice.introduce();   // Output: Hi, I'm Alice Smith. I'm 8 years old, 110 cm tall, and weigh 25 kg. I attend XYZ School and will pass out in 2027.
        alice.learn();       // Output: Alice is learning new things in school.
    }
}

// First Interface (Educational)
interface Educational {
    void learn();
}

// Second Interface (Person)
interface Person {
    void introduce();

    String getName();

    String getSurname();

    int getAge();

    int getHeight();

    int getWeight();
}

// Child class implementing both interfaces
class Child implements Educational, Person {
    // Attributes
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private String school;
    private int passoutYear;

    // Constructor for Child class
    public Child(String name, String surname, int age, int height, int weight, String school, int passoutYear) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.school = school;
        this.passoutYear = passoutYear;
    }

    // Implementation of introduce method from Person interface
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + " " + surname + ". I'm " + age + " years old, " +
                height + " cm tall, and weigh " + weight + " kg.");
        System.out.println("I attend " + school + " and will pass out in " + passoutYear + ".");
    }

    // Implementation of learn method from Educational interface
    @Override
    public void learn() {
        System.out.println(name + " is learning new things in school.");
    }

    // Implementations of getter methods from Person interface
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
