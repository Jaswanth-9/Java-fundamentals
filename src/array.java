import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of values to be sorted : ");
        int s1 = s.nextInt();
        values v = new values(s1);
        v.getvalues(s1);
    }
}

class values{
    private int n1;
    private int[] a = new int[n1];
        public values(int n)
        {
            n1 = n;
        }
        public void getvalues(int n1){
            Scanner z = new Scanner(System.in);
            System.out.println("Enter the values : ");
            for(int i = 0; i < this.n1; i++)
            {
                a[i] = z.nextInt();
            }
            System.out.println("*******************");
            System.out.print("Entered values : ");
            for( int i = 0; i< this.n1; i++)
            {

                System.out.print(a[i]+" ");
            }
        }
 }

