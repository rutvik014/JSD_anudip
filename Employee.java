public class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    // Protected constructor
    protected Employee(int id, int age, String name, boolean isPermanent) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.isPermanent = isPermanent;
    }

    // Factory method to create an instance of Employee
    protected static Employee createEmployee(int id, int age, String name, boolean isPermanent) {
        return new Employee(id, age, name, isPermanent);
    }

    // Protected getter methods
    protected int getId() {
        return id;
    }

    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }

    protected boolean isPermanent() {
        return isPermanent;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the Employee class directly in the main method
        Employee employee = new Employee(14, 22, "Rutvik", true);

        // Printing a message along with member variable details
        System.out.println("Successfully started");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Is Permanent Employee: " + employee.isPermanent());
    }
}
