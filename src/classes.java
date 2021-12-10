import java.util.Scanner;
public class classes {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    classes_bank b = new classes_bank();
    long ph_no1 = 0;
        System.out.print("Account number  : ");
    long acc = a.nextLong();
        System.out.print("Account balance : ");
    int bal = a.nextInt();
    a.nextLine();
        System.out.print("Name            : ");
    String name = a.nextLine();
   // a.nextLine();
        System.out.print("Phone number    : ");
    String ph_no = a.nextLine();
    if(ph_no.length() == 10){
        ph_no1 = Long.parseLong(ph_no);
    }
    else {
        System.out.println(" *** Enter valid phone number *** ");
        System.exit(0);
    }
   // a.nextLine();
        System.out.print("Email           : ");
    String email = a.nextLine();
    b.set_bank(acc,bal,name,email,ph_no1);
        System.out.println("---------------------");
        System.out.print("1.Deposit"+"\n"+"2.Withdraw"+"\n"+"3.Exit"+"\n"+"Enter your selection : ");
        int option = a.nextInt();
        switch (option){
            case 1 :
                System.out.print("Deposit amount : ");
                int amt = a.nextInt();
                System.out.println("---------------------");
                b.deposit(amt);
                b.get_bank();
                break;
            case 2 :
                System.out.print("Withdraw amount : ");
                int amt1 = a.nextInt();
                System.out.println("---------------------");
                if( bal >= amt1) {
                    b.withdraw(amt1);
                    b.get_bank();
                }
                else
                    System.out.println(" *** Insufficient funds *** ");
                break;
            case 3 :
                b.get_bank();
            default :
                System.out.println(" *** Enter valid option *** ");
                System.out.println("---------------------");
                b.get_bank();
        }
    }
}

class classes_bank {
    private long acc_number4;     //this.acc_number
    private int balance;
    private String name;
    private String email;
    private long phone_no;

    public void set_bank(long acc_number,int balance,String name,String email,long phone_no){
        acc_number4 = acc_number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
    }

    public void get_bank(){
        System.out.println("Account number : " + acc_number4 + "\n" + "Balance        : "+this.balance+"\n"+"Name           : "+this.name);
        System.out.println("Email          : "+this.email+"\n"+"Phone number  : "+this.phone_no);
    }

    public void deposit(int amt)
    {
        this.balance = this.balance + amt;
    }

    public void withdraw(int amt)
    {
        this.balance = this.balance - amt;
    }
}


