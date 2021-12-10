package java_fundamentals;
import java.util.Scanner;
public class array_number_present {
    public static void main( String[] abc)
    {
        int c = 0;
        Scanner a = new Scanner(System.in);
        int[] a1 = { 1,3,5,6,7,8,9,13,15,17,20,2,4,5,7,1,8,1,5,0,1};
        int a2 = a.nextInt();
        for( int i=0; i<a1.length; i++)
        {
            if(a1[i] == a2 ){
                System.out.println(i);
                c++;
            }
            else if ( c == 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}
