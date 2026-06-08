package day10;

public class program40 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print((char)('A'+k-1));
            for(int p=i-1;p>=1;p--)
                System.out.print((char)('A'+p-1));
            System.out.println();
        }
    }
}
