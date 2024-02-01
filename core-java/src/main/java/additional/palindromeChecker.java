package additional;

public class palindromeChecker {
    public static boolean isPalindome(int num){
        int originalNum=num;
        int reverseNum=0;

        while(num > 0){
            int digit= num % 10;
            reverseNum = reverseNum * 10  + digit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }

}


