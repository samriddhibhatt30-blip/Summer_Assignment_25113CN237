package day14;
import java.util.Scanner;
public class program56 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array=");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter elements:");
        for(int i=0;i<n ;i++)
            arr[i]=sc.nextInt();
        System.out.print("duplicate elements:");
        for(int i=0;i<n ;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
    
}
