package additional;

public class Factorial {

    public static int factorialOfNumber(int num) {
        int fact = 1;
        if (num < 0)
            return -1;
        else if (num == 0 || num == 1)
            return 1;
        else {
            for (int i = 2; i <= num; i++)
                fact = fact * i;
        }
        return fact;
    }
}

