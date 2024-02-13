package constructor;

public class Static {
    // Static variable
    private static int staticVariable;

    // Static method that returns an int
    public static int getStaticVariable() {
        return staticVariable;
    }

    // Static method that sets the static variable
    public static void setStaticVariable(int value) {
        staticVariable = value;
    }

    public static void main(String[] args) {
        // Using the static method and variable
        setStaticVariable(42);
        System.out.println("Static Variable: " + getStaticVariable());
    }
}
