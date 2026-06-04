package day5;
import java.util.Scanner;
public class program19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number");
         int n=sc.nextInt();
         System.out.println("factors are=");
         for (int i=1; i<=n;i++)
         {
            if(n%i==0)
                System.out.print(i+" ");
         }
         sc.close();
    }
}
