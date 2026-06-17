package day19;
import java.util.Scanner;
public class program75 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows=");
        int r=sc.nextInt();
        System.out.print("enter coloumn=");
        int c=sc.nextInt();
        int[][] a= new int[r][c];
        int[][] transpose = new int[c][r];
        System.out.println("enter elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
    transpose[j][i]=a[i][j];
System.out.println("transpose matrix:");
for(int i=0;i<c;i++)
{
    for(int j=0;j<r;j++)
        System.out.print(transpose[i][j]+" ");
    System.out.println();
}
sc.close();
    }
    
}
