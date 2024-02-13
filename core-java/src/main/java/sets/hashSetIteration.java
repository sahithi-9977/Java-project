package sets;
import java.util.HashSet;
import java.util.Iterator;

public class hashSetIteration {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> stringHashSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Orange");
        stringHashSet.add("Grapes");
        stringHashSet.add("Mango");
        stringHashSet.add("Pineapple");
        stringHashSet.add("Strawberry");
        stringHashSet.add("Watermelon");
        stringHashSet.add("Kiwi");
        stringHashSet.add("Peach");

        // Iterate HashSet using Iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterate HashSet using for loop
        System.out.println("\nIterating HashSet using for loop:");
        for (String element : stringHashSet) {
            System.out.println(element);
        }

        // Iterate HashSet using enhanced for loop
        System.out.println("\nIterating HashSet using enhanced for loop:");
        for (String element : stringHashSet) {
            System.out.println(element);
        }
    }
}
