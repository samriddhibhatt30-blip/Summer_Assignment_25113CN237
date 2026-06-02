package day3;
import java.util.Scanner;
public class program12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b= sc.nextInt();
         int lcm=0;
         for (int i=1;i<=a*b;i++)
         {
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
         }
         System.out.println("LCM=" + lcm);
         sc.close();
        
    }    
}
