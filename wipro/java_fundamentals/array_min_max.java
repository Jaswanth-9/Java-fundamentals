package java_fundamentals;

public class array_min_max {
    public static void main( String[] args ){
        int[] a1 = { 3, 7, 9, 11, 1, 2 , 6, 3};
        int max = a1[0];
        int min = a1[0];
        for(int i=0; i<a1.length; i++)
        {
            if(a1[i]>max)
                max = a1[i];
            if(a1[i]<min)
                min = a1[i];
        }
        System.out.println(" max = " + max);
        System.out.println(" min = " + min);
    }
}
