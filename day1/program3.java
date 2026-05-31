import java.util.Scanner;
public class program3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n=");
        int n = sc.nextInt();
         long fac=1,i;
         for(i=1; i<=n; i++)
         {
             fac=fac*i;
         }
         System.out.println("Factorial of " + n + " is: " + fac);
         sc.close();
    }
    
}
