package day15;
import java.util.Scanner;
public class program57 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("reversed array=");
        for(int i=n-1;i>=0;i--)
          System.out.print(arr[i]+" ");
        sc.close();  
    }
    
}
