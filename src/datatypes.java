import java.sql.SQLOutput;
import java.util.Scanner;
public class datatypes {
    public static void main(String[] abc) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Enter Integer : ");
        int a1 = a.nextInt();
        System.out.println(" Enter Float : ");
        float a2 = a.nextFloat();
        System.out.println(" Enter Double : ");
        double a3 = a.nextDouble();
        System.out.println(" Enter char : ");
        char a4 = a.next().charAt(2);
        a.nextLine();   // to prevent skipping the enter line
        System.out.println(" Enter Line : ");
        String a5 = a.nextLine();
        System.out.println(a1 / 3);
        System.out.println(a2 / 3);
        System.out.println(a3 / 3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
