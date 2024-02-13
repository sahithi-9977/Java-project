package maps;
import java.util.HashMap;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class studentHashMap {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

        // Populate the hashmap with student objects
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.8));
        studentMap.put("Alice", new Student("Alice", "Johnson", 3.9));
        studentMap.put("Bob", new Student("Bob", "Williams", 3.7));
        studentMap.put("Emily", new Student("Emily", "Brown", 4.0));
        studentMap.put("Michael", new Student("Michael", "Jones", 3.6));
        studentMap.put("Sarah", new Student("Sarah", "Davis", 3.4));
        studentMap.put("David", new Student("David", "Miller", 3.2));

        // Method to get student object by name
        System.out.println(getStudentByName("Jane", studentMap));
    }

    public static Student getStudentByName(String name, HashMap<String, Student> studentMap) {
        return studentMap.get(name);
    }
}
