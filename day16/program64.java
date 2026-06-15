package day16;
import java.util.Scanner;
public class program64 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("array without duplication");
        for(int i=0;i<n;i++)
        {
            boolean duplicate=false;
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
                System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
