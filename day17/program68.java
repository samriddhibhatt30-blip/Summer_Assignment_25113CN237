package day17;
import java.util.Scanner;
public class program68 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n1= sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter the elements=");
        for(int i=0;i<n1;i++)
            arr1[i] = sc.nextInt();
        System.out.print("size of  the second array=");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter the elements of second array=");
        for(int i=0;i<n2;i++)
            arr2[i] = sc.nextInt();
        for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n2;j++)
                {

                    if(arr1[i]==arr2[j])
                    {

                     System.out.print(arr1[i] + " ");
                       break;
                    }                    
                }
            }
            sc.close();
    }
    
}
    

