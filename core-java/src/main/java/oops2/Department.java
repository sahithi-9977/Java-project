package oops2;
abstract class Departmntt {
    abstract int getDepartmentSize();
}
class Course extends Departmntt {
    // Implementation of the abstract method
    private int num;
    public Course( int num){
        this.num=num;
    }
    @Override
    int getDepartmentSize() {
        return num;
    }
}

public class Department {
    public static void main(String[] args) {
        // Creating an instance of the Circle class
        Course c = new Course(50);

        // Calling methods from the abstract class and its subclass
        int id=c.getDepartmentSize();
        System.out.println("the integer is : " + id);

    }
}