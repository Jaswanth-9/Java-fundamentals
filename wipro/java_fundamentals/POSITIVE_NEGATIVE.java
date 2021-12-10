package java_fundamentals;
import java.util.Scanner;
public class POSITIVE_NEGATIVE {
    public static void main(String[] abc)
    {
       Scanner a = new Scanner(System.in);
       int a1 = a.nextInt();
       if( a1 > 0 ){
           System.out.println(" POSITIVE ");
       }
       else if( a1 < 0){
           System.out.println(" NEGATIVE ");
       }
       else{
           System.out.println(" enter valid number ");
       }
    }
}
