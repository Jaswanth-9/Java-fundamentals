public class for_loop {
    public static void main( String[] abc){
        for( int i = 1; i <= 5; i++){
            System.out.println(" 1000rs for " + i + "% interest is " + calculator(1000, i));
        }
    }
    public static double calculator(double amount, double interest){
        return(amount * (interest/100));
    }
}
