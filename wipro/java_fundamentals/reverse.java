package java_fundamentals;
import java.util.Scanner;
public class reverse {
    public static void main( String[] abc){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int i = 0;
        while( n >0 )
        {
            int j = n%10;
            i = i*10 + j;
            n = n/10;
        }
        System.out.println(i);
    }
}
