package day16;
import java.util.Scanner;
public class program63 {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of array=");
     int n=sc.nextInt();
      int[] arr = new int[n];
      System.out.println("enter elements");
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.print("enter target sum:");
    int c=sc.nextInt();
    boolean found=false;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==c)
            {
                System.out.println("pair found:"+arr[i]+ "+" +arr[j]+"="+c);
                found=true;
            }
        }
    }
    if(!found)
        System.out.println("no pair found");
    sc.close();
    }
}
