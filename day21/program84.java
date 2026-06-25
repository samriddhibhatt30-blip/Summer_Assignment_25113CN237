package day21;
import java.util.Scanner;
public class program84 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter a string=");
    String s=sc.nextLine();
    String res="";
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(c>='a' && c<='z')
            res += (char)(c-32);
        else
            res += c;
                
    }
    System.out.println("resultant string=" + res);
    sc.close();
    }
    
}
