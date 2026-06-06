package day7;
import java.util.Scanner;
public class program27 {
    static int sumofdigits(int n)
    {
        if(n==0) return 0;
        return(n%10)+ sumofdigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n= sc.nextInt();
        System.out.println("Sum of digits="+sumofdigits(n));
        sc.close();
    }
    
}
