package java_fundamentals;

public class array_smallest_largest {
    public static void main( String[] args)
    {
        int[] a1 = { 2,5,8,1,10,15,10};
        for(int i=0; i<a1.length; i++)
        {
            for( int j=i; j<a1.length; j++)
            {
                if(a1[i]<a1[j])
                {
                    int a = a1[i];
                    a1[i] = a1[j];
                    a1[j] = a;
                }
            }
        }
        System.out.println(" least 2 numbers : " + a1[a1.length-1] + " " + a1[a1.length-2]);

        System.out.println(" largest 2 numbers : " + a1[0] + " " + a1[1]);
    }
}
