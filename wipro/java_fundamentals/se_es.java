package java_fundamentals;
import java.util.Scanner;
public class se_es {
    public static void main(String[] args) {
        Scanner a = new Scanner( System.in );
        char a1 = a.next().charAt(0);
        char a2 = a.next().charAt(0);
        if (a1 > a2) {
            System.out.println(a2 + ", " + a1);
        } else {
            System.out.println(a1 + ", " + a2);
        }
    }
}
