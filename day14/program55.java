package day14;
import java.util.Scanner;
public class program55 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array= ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n ;i++)
            arr[i]=sc.nextInt();
        int l=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>l)
            l=arr[i];
        }
        int s=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>s && arr[i]!=l)
                s=arr[i];
        }
        System.out.println("second largest="+s);
        sc.close();
    }
}
