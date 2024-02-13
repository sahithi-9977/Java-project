package loops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Print Fibonacci Series up to N
        System.out.println("Fibonacci Series up to " + N + " terms:");
        for (int i = 0; i < N; i++) {
            if (i%3 ==0 ){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
}}
