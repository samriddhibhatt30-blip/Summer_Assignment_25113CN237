import java.util.Scanner;
public class day1program2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n=");
        int n = sc.nextInt();
        int p=1,i;
         for(i=1;i<=10; i++)
         {
            System.out.println(n +"*" + i + "=" +(n*i));
         }
 sc.close(); 
   }
    
}
