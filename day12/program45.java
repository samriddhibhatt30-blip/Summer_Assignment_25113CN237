package day12;

import java.util.Scanner;

public class program45 {
    static boolean palindrome(int n)
    {
        int rev=0;
        int c=n;
        while(c>0)
        {
            rev =rev*10 +c%10;
            c=c/10;
        }
        return n==rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no.");
        int n= sc.nextInt();
          if (palindrome(n))
            System.out.print("is palindrome");
        else
            System.out.print("is  not palindrome");
        sc.close();
    }
}
