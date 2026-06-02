package day3;
import java.util.Scanner;
public class program10 {
    public static void main(String[] args){
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter start");
        int start= sc.nextInt();
        System.out.print("Enter end");
        int end= sc.nextInt();

        System.out.println("Prime numbers between the range");
        for(int i=start; i<=end ; i++)
        {
            c=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            
            }
            if(c==2)
            {
                System.out.println(i);
            }
            sc.close();
        }
        
    }
} 

 

