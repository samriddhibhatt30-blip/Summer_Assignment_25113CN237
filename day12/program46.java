package day12;

import java.util.Scanner;

public class program46 {
    static boolean armstrong(int n)
    {
        int sum=0;
        int c=n;
        while(c>0)
        {
            int t= c%10;
            sum =sum +(t*t*t);
            c=c/10;
        }
        return n==sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n= sc.nextInt();
        if( armstrong(n))
            System.out.print("is armstrong ");
        else
            System.out.print(" is not armstrong");
        sc.close();
    }
}
