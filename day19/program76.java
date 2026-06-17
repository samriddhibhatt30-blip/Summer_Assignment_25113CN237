package day19;
import java.util.Scanner;
public class program76 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array=");
        int n=sc.nextInt();
        int[][] a= new int[n][n];
        System.out.println("enter elements=");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
    int firstdiag=0;
    int secdiag=0;
    for(int i=0;i<n;i++){
        firstdiag+=a[i][i];
    secdiag += a[i][n-1-i];
    }
    System.out.println("first diagonal sum="+firstdiag);
    System.out.println("second diagonal sum="+secdiag);
    sc.close();
                
    }
    
}
