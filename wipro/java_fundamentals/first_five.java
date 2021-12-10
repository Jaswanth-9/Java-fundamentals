package java_fundamentals;
public class first_five {
    public static void main( String[] rgs){
        int c = 0;
        int n = 1;
        while(c<5){
            if( n%2 == 0 && n%3 == 0 && n%5 == 0){
                System.out.println(n);
                c++;
            }
            n++;
        }
    }
}
