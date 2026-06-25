package day21;
import java.util.Scanner;
public class program82 {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
             System.out.print(" ENTER A STRING= ");
             String s=sc.nextLine();
             int c=s.length();
             String reverse="";
             for(int i=c-1;i>=0;i--)
                reverse+=s.charAt(i);
            System.out.println("reversed string="+reverse);
            sc.close();
    }
}
