package java_fundamentals;

public class array_duplicate {
    public static void main( String[] args)
    {
        int[] a1 = { 1,3,9,7,1,5,100,99,45,12,5,5,5,12,18,79,64,51,28,99,100,45};
        for(int i=0;i<a1.length;i++)
        {
            for( int j=i; j<a1.length;j++)
            {
                if(a1[i] != a1[j]){
                    int a = a1[i];
                    a1[i] = a1[j];
                    a1[j] = a;

                }
            }
        }
        System.out.println(" array : ");
        for( int i=0; i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
    }
}
