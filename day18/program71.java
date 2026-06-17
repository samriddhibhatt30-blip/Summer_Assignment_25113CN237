package day18;
import java.util.Scanner;
public class program71 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY=");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements=");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("enter the elements to search=");
        int k=sc.nextInt();
        int l=0,h=n-1;
        int res=-1;
        while(l<=h)
         {   int mid=(l+h)/2;
        if(arr[mid]==k){
            res=mid;
            break;
        }
        else if(arr[mid]<k)
        {
            l=mid+1;
        }
        else
        {
            h=mid-1;
        }
    } 
    if(res!=-1)
        System.out.println(k+"found at index"+res);
    else
        System.out.println(k+"not found");
     sc.close();    
    }
}
    
    

