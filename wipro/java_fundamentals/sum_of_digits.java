package java_fundamentals;

public class sum_of_digits {
    public static void main(String[] args) {
        int a = 1234;
        int s = 0;
        while (a != 0) {
            s = s + (a % 10);
            a = a/10;
        }
        System.out.println(s);
    }
}
