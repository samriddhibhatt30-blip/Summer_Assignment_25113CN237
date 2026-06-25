package day22;
import java.util.Scanner;
public class program87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s = sc.nextLine();
        System.out.print("enter the character to be  searched:=");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("" +ch +" appears " + count +" times");
        sc.close();
    }
}
