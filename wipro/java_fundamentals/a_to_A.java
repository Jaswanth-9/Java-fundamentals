package java_fundamentals;
import java.util.Scanner;
public class a_to_A {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char c = a.next().charAt(0);
        if (Character.isLowerCase(c))
            System.out.println(c + "->" + Character.toUpperCase(c));
        else
            System.out.println(c + "->" + Character.toLowerCase(c));
    }
}
