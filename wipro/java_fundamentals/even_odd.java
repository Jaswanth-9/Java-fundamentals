package java_fundamentals;
import java.util.Scanner;
public class even_odd {
public static void main ( String[] abc)
{
    Scanner a = new Scanner( System.in );
    int a1 = a.nextInt();
    int a2 = a1%2;
    if( a2 == 1 ){
        System.out.println(" ODD NUMBER ");
    }
    else
        System.out.println( " EVEN NUMBER ");
}
}
