package day11;

import java.util.Scanner;

public class program42 {
    static int maximum(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first no:");
        int a= sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.println(" maximum=" + maximum(a,b));
        sc.close();
    }
}
