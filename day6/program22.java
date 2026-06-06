package day6;
import java.util.Scanner;
public class program22 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a  binary number");
    long b=sc.nextLong();
    int dec=0 , p=0;
    while (b>0) {
        int d=(int)(b%10);
        dec= dec + d*(int)Math.pow(2,p);
        b= b/10;
        p++;
    }
    System.out.print("decimal number"+dec);
    sc.close();
}
}
