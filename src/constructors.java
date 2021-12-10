import java.util.Scanner;
public class constructors {
    public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    Vip_customer v = new Vip_customer();
        System.out.println("SELECT AN OPTION"+"\n"+"--------------------"+"What do you have ? ");
        System.out.println("1.NOTHING"+"\n"+"2.Name and Email"+"\n"+"3.Name,Email and Salary");
        System.out.print("Enter your option : ");
        int a1 = a.nextInt();
        System.out.println("--------------------");
        switch (a1){
            case 1 :
                v.con();
                v.get();
                break;
            case 2 :
                a.nextLine();
                System.out.print("Enter Name : ");
                String a2 = a.nextLine();
               // a.nextLine();
                System.out.print("Enter Email : ");
                String a3 = a.nextLine();
                v.con(a2,a3);
                v.get();
                break;
            case 3 :
                a.nextLine();
                System.out.print("Enter Name : ");
                String a4 = a.nextLine();
              //  a.nextLine();
                System.out.print("Enter Email : ");
                String a5 = a.nextLine();
             //   a.nextLine();
                System.out.print("Enter Credit limit : ");
                int a6 = a.nextInt();
                v.con(a4,a5,a6);
                v.get();
                break;
            default :
                System.out.println(" ***** INVALID OPTION ***** ");
        }
    }
}

class Vip_customer{
    private String name;
    private int credit_limit;
    private String email;

    public void con()
    {
        this.name = "default name";
        this.credit_limit = 25000;
        this.email = "default email";
    }

    public void con(String name, String email){
        this.name = name;
        this.email = email;
        this.credit_limit = 25000;
    }

    public void con(String name, String email, int credit_limit){
        this.name = name;
        this.email = email;
        this.credit_limit = credit_limit;
    }

    public void get(){
        System.out.println(" ---------------");
        System.out.println(" ---------------");
        System.out.println(" NAME         : "+this.name);
        System.out.println(" EMAIL        : "+this.email);
        System.out.println(" CREDIT LIMIT : "+this.credit_limit);
    }
}