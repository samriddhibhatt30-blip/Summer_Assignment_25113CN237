package day20;
import java.util.Scanner;
public class program80 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows=");
        int r=sc.nextInt();
        System.out.println("enter the columns=");
        int c= sc.nextInt();
        int[][] a = new int[r][c];
        System.out.print("enter the elements=");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
    
        System.out.println("column wise sums:");
        for(int j=0;j<c;j++)
        {
            int sum=0;
            for(int i=0;i<r;i++)
                sum+=a[i][j];
            System.out.println("column" + j +" sum="+sum);
        }
        sc.close();
    
    
    
    }
}
