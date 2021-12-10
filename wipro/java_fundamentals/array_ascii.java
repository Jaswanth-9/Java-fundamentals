package java_fundamentals;

public class array_ascii {
    public static void main( String[] args){
        int[] a1 = { 65, 67, 73, 109, 88,126};
        for( int i=0; i<a1.length; i++)
        {
            char c = (char)a1[i];
            System.out.println(c);
        }
    }
}
