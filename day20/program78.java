package day20;
import java.util.Scanner;
public class program78 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size= ");
        int n=sc.nextInt();
        int[][] a= new int[n][n];
        System.out.println("enter the elements=");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
     
        boolean symmetric=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(a[i][j]!=a[j][i])
                    symmetric = false;
        }
    }
    if(symmetric)
        System.out.println("matrix is symmetric");
    else
        System.out.println("matrix is not symmetric");
    sc.close();
    }
    
}
