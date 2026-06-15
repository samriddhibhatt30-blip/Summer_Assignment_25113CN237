package day17;
import java.util.Scanner;
public class program66 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int n1=sc.nextInt();
        int[] arr1 = new int[n1];
    System.out.println("enter elements");
    for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();

    System.out.println("enter the size of array2=");
    int n2=sc.nextInt();
    int[] arr2 = new int[n2];
    System.out.println("enter  the elements");
    for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
    System.out.print("union= ");
    for(int i=0;i<n1;i++)
    {
        boolean dup=false;
        for(int j=0;j<i;j++)
            if(arr1[i]==arr2[j])
                dup=true;
            if(!dup)
                System.out.print(arr1[i]+" ");

    }
    for(int i=0;i<n2;i++)
    {
        boolean dup=false;
        for(int j=0;j<n1;j++)
            if(arr2[i]==arr1[j])
                dup=true;
            for(int j=0;j<i;j++)
            if(arr2[i]==arr2[j])
                dup=true;
            if(!dup)
                System.out.print(arr2[i]+" ");
    }
    sc.close();
}
    
}
