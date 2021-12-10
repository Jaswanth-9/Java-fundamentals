public class method_overloading {
    public static void main( String[] abc)
    {
    double feet = 5;
    double inches = 4;
    convert(feet, inches);
    convert(162.56);
    }

    public static double convert(double feet, double inches)
    {
    if(feet > 0 && inches > 0 && inches < 12){
        double cm = ((feet * 12 * 2.54) + (inches * 2.54));
        System.out.println(feet + " feet & " + inches + " inches = "+ cm + "cm's");
        return cm;
    }
    else
        return -1;
    }

    public static double convert(double cm)
    {
        if(cm > 0 ){
            double feet = (int) ((cm/2.54)/12);
            double inches = (( cm/2.54)%12);
            System.out.println(cm + " = " + feet + " feet & " + inches + " inches" );
            return 1;
        }
        else
            return -1;
    }
}
