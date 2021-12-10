public class while_code {
    public static void main(String[] abc){
        int number = 1568;
        int sum = 0;
        while(number > 0){
            int digit = number%10;
            sum += digit;
             number = number/10;
        }
        System.out.println( " total = " + sum);
    }
}
