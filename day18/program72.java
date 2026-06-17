package day18;
import java.util.Scanner;
public class program72 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("descending sorted array=");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
        
    }
    
}
