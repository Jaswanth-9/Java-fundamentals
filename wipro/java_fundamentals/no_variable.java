package java_fundamentals;
import java.util.Scanner;
public class no_variable {
    public static void main ( String[] args ){
        args = new String[]{ };
        if (args.length == 0) {
            System.out.println("No Values");
        }
        else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
    }
}
