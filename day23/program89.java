package day23;
import java.util.Scanner;
public class program89 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=sc.nextLine();
        int[] count = new int[256];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        boolean found =false;
        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==1){
                System.out.println("first non-repeating characters:"+s.charAt(i));
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("no non repeating chracers");
            sc.close();
    } 
    
}
