package day12;
import java.util.Scanner;
public class program48 {
    static boolean perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum = sum+i;
        }
        return n==sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no.");
        int n= sc.nextInt();
        if(perfect(n))
            System.out.print("perfect number");
        else
            System.out.print("not a perfect number");
        sc.close();
    }
    
}
