import java.util.Scanner;

public class integers {
    public static void main ( String[] abc ) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Enter 1st number : ");
        int a1 = a.nextInt();
        System.out.println(" enter 2nd number : ");
        int a2 = a.nextInt();
        int a3 = a1*a2;
        int a5 = ( (a1+a2) * a3);
        int a4 = 1000 - a5;
        System.out.println( a4 );
    }
}
