package java_fundamentals;

import java.util.Scanner;
public class sum_numbers {
    public static void main (String[] abc) {
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        int a2 = a.nextInt();
        int a3 = a1 + a2;
        System.out.println(a3);
        a.close();
    }
}
