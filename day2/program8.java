import java.util.Scanner;
public class program8 {
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
System.out.print("enter a no. =");
int n = sc.nextInt();
 int rev =0;
 int t=n,c;
 while(t>0)
 {
    c=t%10;
    rev= rev*10 +c;
    t=t/10;
 }
 if(n==rev)
    System.out.println("Palindrome");
 else 
    System.out.println("Not palindrome");
sc.close();
 }

 }