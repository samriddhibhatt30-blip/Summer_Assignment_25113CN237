package day11;

import java.util.Scanner;

public class program44 {
    static long factorial(int n)
    {
        long fact=1;
        for(int i=1; i<=n; i++)
            fact= fact*i;
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a no.");
        int n=sc.nextInt();
        System.out.println("factorial="+ factorial(n));
        sc.close();
    }
}
