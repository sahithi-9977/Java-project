package additional;
import java.util.*;

public class Repeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        String s= (sc.next());
        char[] x=s.toCharArray();
        for(int i=0;i<=x.length-1;i++){
            if(i!=s.lastIndexOf(x[i])){
                System.out.print(x[i]+"");
            }
        }
    }
}