package day20;
import java.util.Scanner;
public class program79 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter rows=");
        int r=sc.nextInt();
        System.out.print("enter coloumns=");
        int c=sc.nextInt();
         int[][] a=new int[r][c];
         System.out.print("enter elements=");
         for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
        System.out.println("row wise sums:");
    for(int i=0;i<r;i++)
       { int sum=0;
    for(int j=0;j<c;j++)
    sum+=a[i][j];
System.out.println("row "+i+" sum = "+sum);
       }
       sc.close();

    }
    
}
