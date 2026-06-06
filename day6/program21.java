package day6;
import java.util.Scanner;
public class program21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number");
        int n=sc.nextInt();
        String b="";
        int c=n;
        while (c>0) {
            b=b+ (c%2);
            c=c/2;
        }
        System.out.println("binary number is "+ b);
        sc.close();
    }
}
