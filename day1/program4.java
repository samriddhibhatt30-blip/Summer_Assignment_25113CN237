import java.util.Scanner;
public class program4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n=");
        int n = sc.nextInt();
         int c=0;
         int t=Math.abs(n);
         if (t==0)
         {
            c=1;
        
         }
         else
         {
            while(t>0)
            {
                t=t/10;
                c++;
            }
         }
         System.out.println(" no of digits ="+ c);
         sc.close();
    }
    
}
