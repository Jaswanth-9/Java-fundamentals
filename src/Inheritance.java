import java.util.Scanner;
public class Inheritance
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        System.out.print(" Enter type  : ");
        String a1 = a.nextLine();
        System.out.print(" Enter Brand : ");
        String a2 = a.nextLine();
        vehicle v = new vehicle(a1,a2);
        // v.details();
        System.out.print(" Enter colour : ");
        String a3 = a.nextLine();
        System.out.print(" Enter seater : ");
        int a4 = a.nextInt();
        specific sp = new specific(a1,a2,a3,a4);
       // sp.details();
        a.nextLine();
        System.out.print(" Enter chasis : ");
        String a5 = a.nextLine();
        indepth id = new indepth(a1,a2,a3,a4,a5);
        id.details();
    }
}

class vehicle{
    String type;
    String brand;
    public vehicle(String t, String b){
        type = t;
        brand = b;
    }
    public void details(){
        System.out.println("-----------------------");
        System.out.println(" TYPE   : " + type);
        System.out.println(" BRAND  : " + brand);
    }
}

class specific extends vehicle{
    String colour;
    int seater;
    public specific(String t1, String b1, String c, int s){
         super(t1, b1);
         colour = c;
         seater = s;
    }
    public void details(){
        System.out.println("-----------------------");
        System.out.println(" TYPE   : " + type);
        System.out.println(" BRAND  : " + brand);
        System.out.println(" COLOUR : " + colour);
        System.out.println(" SEATER : " + seater);
    }
}

class indepth extends specific {
    String chasis;

    public indepth(String s1, String s2, String s3, int s4, String s5) {
        super(s1, s2, s3, s4);
        chasis = s5;
    }

    public void details() {
        System.out.println("-----------------------");
        System.out.println(" TYPE   : " + type);
        System.out.println(" BRAND  : " + brand);
        System.out.println(" COLOUR : " + colour);
        System.out.println(" SEATER : " + seater);
        System.out.println(" CHASIS : " + chasis);
    }
}