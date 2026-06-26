package day23;
import java.util.Scanner;
public class program92 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string= ");
        String s=sc.nextLine();
        char maxchar=s.charAt(0);
        int maxcount =0;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count>maxcount)
            {
                maxcount=count;
                maxchar=s.charAt(i);
            }
        }
        System.out.println("the character that appears most frequently is: "+maxchar);
        sc.close();
    }
    
}
