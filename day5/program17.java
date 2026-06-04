package day5;
import java.util.Scanner;
public class program17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<=n ; i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }
        if(sum==n)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT A PERFECT NUMBER");
        }
        sc.close();
    }

}