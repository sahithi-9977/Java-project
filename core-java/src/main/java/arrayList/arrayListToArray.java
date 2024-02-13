package arrayList;
import java.util.ArrayList;
public class arrayListToArray {
    public static String[] convertArrayListToArray(ArrayList<String> list) {
        // Create a new array of Strings with the same size as the ArrayList
        String[] array = new String[list.size()];
        // Copy elements from ArrayList to the array
        list.toArray(array);

        return array;
    }
}