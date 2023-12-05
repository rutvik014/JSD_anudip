public class Person {
    private String personName;
    private String collegeName;
    private int personID;

    public Person(String personName, String collegeName, int personID) {
        this.personName = personName;
        this.collegeName = collegeName;
        this.personID = personID;
    }

    public static void main(String[] args) {
        // Creating an instance of Person class
        Person person = new Person("John Doe", "ABC University", 123456);

        // Printing a message
        System.out.println("Successful");
    }
}
