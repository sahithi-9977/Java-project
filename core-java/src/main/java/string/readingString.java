package string;

import java.util.*;

public class readingString {
    public static String readstring(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        return s;
    }
}