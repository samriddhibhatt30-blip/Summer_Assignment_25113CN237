package day23;
import java.util.Scanner;
public class program91 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String st1=sc.nextLine().toLowerCase();
        System.out.print("enter the string:");
        String st2=sc.nextLine().toLowerCase();

        if(st1.length()!=st2.length())
        {
            System.out.println("not anagram");
        }
        else
        {
            int[] count=new int[26];
            for(int i=0;i<st1.length();i++)
                count[st1.charAt(i)-'a']++;
            for(int i=0;i<st2.length();i++)
                count[st2.charAt(i)-'a']--;
            boolean isAnagram=true;
            for(int i=0;i<26;i++)
            {
                if(count[i]!=0)
                {
                 isAnagram=false;
                    break;
                }
            }
        
        if(isAnagram)
            System.out.println("STRINGS ARE ANAGRAM");
        else
            System.out.println("Stringa are not anagram");
    }
        sc.close();
    }
    
}
