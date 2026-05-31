
import java.util.Scanner;
public class day1program1 {
 public static void main(String[] args) {
    int i;
     Scanner sc = new Scanner(System.in);
     System.out.println(" value of n=");
     int n=sc.nextInt();
     int sum=0;
     for(i=1;i<=n;i++)
     {
        sum= sum+ i;
     }
     System.out.println("Sum of first"+n+"natural numbers is :" +sum);
     sc.close();
 }    
}
