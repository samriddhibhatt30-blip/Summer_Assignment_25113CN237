package day11;

import java.util.Scanner;

public class program43 {
    static boolean prime(int n)
    {
        if(n<=1) 
            return false;
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n= sc.nextInt();
        if(prime(n))
        System.out.println("is prime");
    else 
        System.out.print("is not prime");
    sc.close();
    }
}
