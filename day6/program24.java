package day6;
import java.util.Scanner;
public class program24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base");
        int x=sc.nextInt();
        System.out.print("Enetr power");
        int n= sc.nextInt();
        long r=1;
        for(int i=1; i<=n; i++)
            r=r*x;
        System.out.println(r);
        sc.close(); 

    }
}
