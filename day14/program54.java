package day14;
import java.util.Scanner;
public class program54 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.print("enter element");
        int k = sc.nextInt();
         int c=0;
         for(int i=0;i<n;i++)
         {
            if(arr[i]==k)
                c++;
         }
         System.out.println( k + " appears " + c + " times");
         sc.close();
    }
}
