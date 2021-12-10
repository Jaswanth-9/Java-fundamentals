public class for_prime{
    public static void main( String[] abc ){
        int number = 4193;
        prime(number);
    }
    public static void prime( int number){
        boolean flag = true;
        if(number >=2) {
            for (int i = 2; i < number; i++) {
                int output = number%i;
                if( output == 0)
                {
                    flag = false;
                }
            }
            if(flag){
                System.out.println( number + " is a prime number ");
            }
            else
            {
                System.out.println( number + " is not a prime number ");
            }
        }
        else
        {
            System.out.println(number + " is not a prime number ");
        }
    }
}
