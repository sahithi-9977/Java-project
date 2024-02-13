package oops2;

    class Parent {
        public void makeSound() {
            System.out.println("This is the Parent class");
        }
    }

    class Child extends Parent {
        @Override
        public void makeSound() {
            System.out.println("This is the child class");
        }
    }

    public class RunTimePolymorphism{
        public static void main(String[] args) {
            // Using runtime polymorphism
            Parent a = new Parent();
            Child b = new Child();

            // Calling the overridden method
            a.makeSound();  // Calls makeSound from Animal class
            b.makeSound();    // Calls overridden makeSound from Dog class
        }
    }
