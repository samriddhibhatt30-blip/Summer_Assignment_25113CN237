package day20;
import java.util.Scanner;
public class program77 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows of A=");
        int r1=sc.nextInt();
        System.out.print("enter the column of B=");
        int c1=sc.nextInt();
        System.out.print("enter columns of B=");
        int c2=sc.nextInt();
         int[][] a=new int[r1][c1];
         int[][] b= new int[c1][c2];
         int[][] product = new int[r1][c2];

         System.out.println("enter the elements of A=");
         for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
            a[i][j]=sc.nextInt();
        System.out.println("enter the elements of matrix B=");
        for(int i=0;i<c1;i++)
            for(int j=0;j<c2;j++)
        b[i][j]=sc.nextInt();
    for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                int sum=0;
                for(int k=0;k<c1;k++)
                    sum+= a[i][k]* b[k][j];
                product[i][j]=sum;
            }
        }         
        System.out.println("product matrix");
        for(int i=0;i<r1;i++)
           {
            for(int j=0;j<c2;j++)
                System.out.print(product[i][j]+" ");
            System.out.println();
           } 
           sc.close();
    }
    
}
