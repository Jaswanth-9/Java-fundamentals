import java.util.Scanner;

public class input_code {
    public static void main(String[] bc){
        Scanner a = new Scanner(System.in);
        System.out.println(" Enter your name : ");
        String name = a.nextLine();
        System.out.println(" Enter marks of science : ");
        float sci = a.nextFloat();
        System.out.println(" Enter marks of maths : ");
        float maths = a.nextFloat();
        float total = sci + maths;
        System.out.println(name + " total marks are : " + total);
    }
}
