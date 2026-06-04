package day5;
import java.util.Scanner;
public class program20 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        int l=-1;
        while (n%2==0) {
            l=2;
            n=n/2;
            
        }
        for(int i=3;i<=Math.sqrt(n); i=i+2)
        {
            while(n%i==0)
            {
                l=i;
                n=n/i;
            }
        }
        if(n>2)
            l=n;
        System.out.println("Largest prime factor=" +l);
        sc.close();
    }
}
