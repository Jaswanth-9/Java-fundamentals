package java_fundamentals;

public class array_sum {
    public static void main( String[] args){
        int[] a1 = { 3, 6 ,9, 5};
        int sum = 0;
        for(int i=0; i<a1.length; i++ ){
            sum = sum + a1[i];
        }
        System.out.println(" sum = " + sum);

        double avg = (double) sum/(a1.length);
        System.out.println(" average = " + avg);
    }
}
