package java_fundamentals;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] abc) {
        Scanner m = new Scanner(System.in);
        String m1 = m.nextLine();
        if (m1.length() == 0) {
            System.out.println(" enter valid number ");
        } else {
            int m3 = Integer.parseInt(m1);
            int m2 = Integer.parseInt(m1);
            int i = 0;
            while (m2 > 0) {
                int j = m2 % 10;
                i = i * 10 + j;
                m2 = m2 / 10;
            }
            if( i == m3){
                System.out.println(" palindrome ");
            }
            else{
                System.out.println(" not palindrome ");
            }
        }
    }
}
