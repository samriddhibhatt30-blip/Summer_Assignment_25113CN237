package day16;
import java.util.Scanner;
public class program61 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of array");
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.println("enter elements:");
    for(int i=0;i<n-1;i++)
        arr[i]=sc.nextInt();
    int S=n*(n+1)/2;
    int sum=0;
    for(int i=0;i<n-1;i++)
        sum=sum+ arr[i];
    int m=S-sum;
    System.out.println("missing number="+m);
    sc.close();
    }

    
}
