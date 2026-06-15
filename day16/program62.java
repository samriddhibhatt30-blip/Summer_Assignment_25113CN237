package day16;
import java.util.Scanner;
public class program62 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int maxElement=arr[0];
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                    count++;
            }
            if(count>maxcount)
            {
                maxcount=count;
                maxElement=arr[i];
            }
        }
        System.out.println("element with max frequency"+maxElement);
        System.out.println("frequency="+maxcount);
        sc.close();
    }
    
}
