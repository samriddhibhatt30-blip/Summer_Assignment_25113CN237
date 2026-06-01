import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt();
        int sum =0;
        int c=Math.abs(n);
        while(c>0)
        {
         int t= c%10;
         sum = sum + t;
         c= c/10;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();

    }
}
