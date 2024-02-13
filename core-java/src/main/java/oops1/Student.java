package oops1;

public class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Main method (for testing)
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        String studentName = student.getName();


        System.out.println("Student's name: " + studentName);
    }
}

