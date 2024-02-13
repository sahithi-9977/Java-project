package constructor;

final class PackageRestrictedClass {
    // Final variable
    final int finalVariable = 10;
    final void packageRestrictedMethod() {
        System.out.println("Package-restricted method called");
    }
}

class AnotherClassInPackage {
    public static void main(String[] args) {
        // Creating an instance of PackageRestrictedClass
        PackageRestrictedClass restrictedObj = new PackageRestrictedClass();

        // Accessing final variable and method within the same package
        System.out.println("Final Variable: " + restrictedObj.finalVariable);
        restrictedObj.packageRestrictedMethod();
    }
}
