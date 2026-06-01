import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt();
        int p=1;
        int c=Math.abs(n);
        while(c>0)
        {
         int t= c%10;
         p = p*t;
         c= c/10;
        }
        System.out.println("Product of digits: " + p);
        sc.close();
    }    
}
