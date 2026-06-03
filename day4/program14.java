package day4;
import java.util.Scanner;
public class program14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.");
        int n= sc.nextInt();
        int sum=0;
        int c=n;
        while(c>0)
        {
            int t=c%10;
            sum = sum + (t*t*t);
            c=c/10;
        }
        if(sum==n)
        System.out.println("ARMSTRONG NO.");
        else
        System.out.println("NOT AN ARMSTRONG NUMBER");
    sc.close();
    }
    
}
