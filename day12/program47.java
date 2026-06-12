package day12;
import java.util.Scanner;
public class program47 {
    static void fibonacci(int n)
    {
        int a=0, b=1;
        System.out.print("fibonacci series");
        for(int i=1;i<=n ;i++)
        {
            System.out.print(a+" ");
            int c= a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
