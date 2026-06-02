package day3;
import java.util.Scanner;
public class program11 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter first no.:");
     int a=sc.nextInt();
     System.out.println("Enter second num:");
     int b= sc.nextInt();
      while (b!=0)
      {
        int c=b;
        b=a%b;
        a=c;
      }
      System.out.println("gcd=" + a);
      sc.close();
    }
    
}
