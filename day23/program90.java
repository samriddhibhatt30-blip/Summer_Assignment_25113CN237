package day23;
import java.util.Scanner;
public class program90 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
        char result =  ' ';
        boolean found =false;
        for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        result = s.charAt(i);
                        found=true;
                        break;
                    }
                }
                if(found)break;
            }        
            if(found)
                System.out.println("first repeating character="+result);
            else
                System.out.println("no repeating character found");
            sc.close();
    
    }
    
}
