package day4;
import java.util.Scanner;
public class program15 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number");
        int s= sc.nextInt();
        System.out.println("Enter end");
        int e =sc.nextInt();
         System.out.println("Armstrong numbers in range");
         for ( n=s; n<=e ;n++)
            {
                int sum=0;
                int c=n;
                while(c>0)
                {
                    int t=c%10;
                    sum = sum +(t*t*t);
                    c=c/10;
                }
                if(sum==n)
                    System.out.println(n);
            }   
            sc.close();
    }
}
