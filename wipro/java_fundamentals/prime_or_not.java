package java_fundamentals;

public class prime_or_not {
    public static void main (String[] args)
    {
        int a = 7;
        boolean flag = false;
        for(int i=2;i<a;i++)
        {
            if(a%i == 0) {
                flag = true;
                break;
            }
        }
        if( flag )
        {
            System.out.println(" not prime ");
        }
         else
            System.out.println(" prime ");
    }
}
