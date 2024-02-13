package streamandlamda;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class MathOperations {
    public static int NumbersSum(int number1, int number2) {
        int sum;
        MathOperation addition = (a,b) -> a + b;
        sum= addition.operate(number1,number2);
        return sum;
    }

}