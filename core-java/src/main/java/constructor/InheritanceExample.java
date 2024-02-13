package constructor;
// Parent class
class Parent {
    protected int parentVariable;

    // Constructor in the parent class
    public Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

// Child class extending Parent
class Child extends Parent {
    private int childVariable;

    // Constructor to initialize both instance variables
    public Child(int parentVariable, int childVariable) {
        // Call the constructor of the parent class to initialize parentVariable
        super(parentVariable);
        this.childVariable = childVariable;
    }

    // Overloaded constructor with one parameter
    public Child(int childVariable) {
        // Call the constructor of the parent class with a default value for parentVariable
        this(0, childVariable);
    }

    // Getter method for childVariable
    public int getChildVariable() {
        return childVariable;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of Child using the constructor with both parameters
        Child child1 = new Child(10, 20);

        // Creating another instance of Child using the constructor with one parameter
        Child child2 = new Child(30);

        // Accessing instance variables
        System.out.println("Child 1 - Parent Variable: " + child1.parentVariable + ", Child Variable: " + child1.getChildVariable());
        System.out.println("Child 2 - Parent Variable: " + child2.parentVariable + ", Child Variable: " + child2.getChildVariable());
    }
}
