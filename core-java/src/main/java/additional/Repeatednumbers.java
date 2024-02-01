package additional;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeatednumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String s= (sc.next());
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(i!=s.lastIndexOf(s.charAt(i))){
                n.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        System.out.println(n);
    }}