package day13;
import java.util.Scanner;
public class program52 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array=");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int even=0 ,odd=0;
        for(int i=0; i<n ; i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even count="+even);
        System.out.println("odd count="+ odd);

        sc.close();
    }
    
}
