package day13;
import java.util.Scanner;
public class program51 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array =");
        int n= sc.nextInt();
         int[] arr = new int[n];
         System.out.println("enter elements");
         for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int l= arr[0];
        int s= arr[0];
 for(int i=1;i<n ;i++)
 {
    if(arr[i]>l)
        l=arr[i];
    if(arr[i]<s)
        s=arr[i];
    
 }
 System.out.println("largest number="+l);
 System.out.println("smallest number="+s);
 sc.close();
    }
}
