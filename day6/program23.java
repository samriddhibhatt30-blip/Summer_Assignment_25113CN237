package day6;
import java.util.Scanner;
public class program23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        int c=0,b=n;
        while (b>0) {
            if(b%2==1)
                c++;
            b=b/2;
        }
        System.out.println(c);
        sc.close();
    }
}
