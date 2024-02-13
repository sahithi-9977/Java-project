package additional;

import java.util.Scanner;

public class Arraysum {
        public static void main(String[] args) {
            // Example array
            int[] array = {10, 8, 30, 4, 15};
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter:");
            int sum=0;
            for (int j : array) {
                sum += j;
        }
            System.out.println("Sum of the array elements: " + sum);
        }

    }

