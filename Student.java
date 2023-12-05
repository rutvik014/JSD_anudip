public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Private constructor
    private Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Factory method to create an instance of Student
    public static Student createStudent(String studentName, String collegeName, int studentID) {
        return new Student(studentName, collegeName, studentID);
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getStudentID() {
        return studentID;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the Student class with specified values
        Student student = new Student("Rutvik", "M.K. Gandhi College", 123614);

        // Printing a message
        System.out.println("Successful");

        // Accessing and printing member variables using getter methods
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("College Name: " + student.getCollegeName());
        System.out.println("Student ID: " + student.getStudentID());
    }
}
