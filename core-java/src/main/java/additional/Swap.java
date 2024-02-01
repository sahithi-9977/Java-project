package additional;

public class Swap {
    public static void swapTwoNumbersWithoutExternalVariable(int num1,int num2){

        // Swap without using a third variable
        num1 = num1 + num2;
        num2= num1-num2;
        num1=num1-num2;

        System.out.println("After swapping num1 : " +num1);
        System.out.println("After swapping num2 : " +num2);
    }
}