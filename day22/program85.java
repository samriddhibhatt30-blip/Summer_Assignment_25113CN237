package day22;
import java.util.Scanner;
public class program85 {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a string=");
       String s=sc.nextLine();
       String rev="";
       for(int i=s.length()-1;i>=0;i--)
       {
           rev += s.charAt(i);
       }
       if(s.equals(rev))
       System.out.println(" is a palindrome");
    else
        System.out.println("is not a palindrome");
       sc.close();
    }
    
}
