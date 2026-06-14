package day15;
import java.util.Scanner;
public class program60 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int p=0;
        for(int i=0;i<n ;i++)
        {
            if(arr[i]!=0)
                arr[p++]=arr[i];
        }
        while(p<n)
            arr[p++]=0;
        System.out.print("after moving places=");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
    
}
