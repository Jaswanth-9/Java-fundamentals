package java_fundamentals;

public class array_sorting {
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
            System.out.println(" array after sorting : ");
            for(int i=0; i<a1.length; i++){
                System.out.println(a1[i]);
            }
        }
    }


