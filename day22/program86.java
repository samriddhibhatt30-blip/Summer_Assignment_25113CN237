package day22;
import java.util.Scanner;
public class program86 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sentence: ");
        String s = sc.nextLine();
        int count =1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                count++;
        }
        System.out.println("number of words in the sentence: " + count);
        sc.close();
    }
    
}
