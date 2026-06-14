package day15;
import java.util.Scanner;
public class program58 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array=");
    int n= sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter elements=");
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
     System.out.print("enter number to rotate");
     int k=sc.nextInt();
     for(int i=0;i<k;i++)
     {
        int temp=arr[0];
        for(int j=0;j<n-1;j++)
            arr[j]=arr[j+1];
        arr[n-1]=temp;
     }
     System.out.print("after left rotation");
     for(int i=0;i<n ;i++)
        System.out.print(arr[i]+" ");
    sc.close();
    }

    
}
