package day11;

import java.util.Scanner;

public class program41 {
    
        static int sum(int a,int b)
        {
            return a+b;
        }
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("enter first number");
            int a=sc.nextInt();
            System.out.print("enter second number:");
            int b=sc.nextInt();
            System.out.println("sum=" + sum(a,b));
            sc.close();
        }
    
}
