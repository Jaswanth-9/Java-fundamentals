package java_fundamentals;

public class ten_to_99 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = true;
                    break;
                }
        }
            if(flag){
                System.out.println(i + " is not prime ");
            }
            else
            {
                System.out.println( i + " is prime ");
            }
        }
    }
}
