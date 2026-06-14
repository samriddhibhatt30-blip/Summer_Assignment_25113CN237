package day15;
import java.util.Scanner;
public class program59 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array=");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    System.out.print("enter positions to rotatte right");
    int k=sc.nextInt();
    for(int i=0;i<k;i++)
    {
        int temp=arr[n-1];
        for(int j=n-1;j>0;j--)
            arr[j]=arr[j-1];
        arr[0]=temp;
    }
    System.out.print("after the right rotation");
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    sc.close();
    }
    
}
