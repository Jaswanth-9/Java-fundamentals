package java_fundamentals;
import java.util.Scanner;
public class stars {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String a1 = a.nextLine();
        if (a1.length() == 0) {
            System.out.println("Please enter an integer number");
        }
        else {
            int n = Integer.parseInt(a1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
