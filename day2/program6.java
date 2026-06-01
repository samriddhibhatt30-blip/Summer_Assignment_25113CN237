import java.util.Scanner;
public class program6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
         int rev=0;
         int c=Math.abs(n);
         while (c>0)
         {
            int t = c%10;
            rev= rev*10 + t;
            c= c/10;
         }
         System.out.println(" Reverse of no. =" + rev);
         sc.close();        
    }

}
