package day21;
import java.util.Scanner;
public class program81 {
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in); 
    System.out.print("enter a string:");
    String s=sc.nextLine();
    int length=0;
    for(int i=0;i<s.length();i++)
    length++;
System.out.println("length="+length);
sc.close();

}
}
