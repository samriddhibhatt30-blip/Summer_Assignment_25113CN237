package day5;
import java.util.Scanner;
public class program18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no ");
        int n= sc.nextInt();
         int sum=0;
         int c=n;
         while(c>0)
         {
            int t=c%10;
            int fact=1;
            for(int i=1; i<=t; i++)
                fact= fact*i;
            sum= sum+fact;
            c=c/10;
        }
        if(sum==n)
            System.out.println("STRONG NUMBER");
        else
            System.out.println("NOT A STRONG NUMBER");
        sc.close();
    }
}
