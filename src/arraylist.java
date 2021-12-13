import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Add contact"+"\n"+"9.Exit");
        System.out.println("Choose your option : ");
        int s3 = s.nextInt();
        switch(s3){
            case 1 :
                System.out.print("Enter name : ");
                String s1 = s.nextLine();
                s.nextLine();
                System.out.print("Enter number : ");
                String s2 = s.nextLine();
                contactvalues c = new contactvalues(s1,s2);
                System.out.println(c.getname());
                System.out.println(c.getnumber());
            case 9 :
                System.exit(-1);
            default :
                System.out.println("Enter valid option");
                System.exit(-1);
        }
    }
}

class contactvalues{
    private String na;
    private String nu;
    Scanner s = new Scanner(System.in);
    public contactvalues( String name, String number){
        na = name;
        nu = number;
    }

    public String getname(){
        return na;
    }

    public String getnumber(){
        return nu;
    }

    public void getcontact(){
        contactvalues v = new contactvalues(na,nu);
    }

}

class lists{
    private String number;
    private ArrayList<contactvalues> contacts;
    public lists(String number){
        this.number = number;
        this.contacts = new ArrayList<contactvalues>();
    }

    public void add(contactvalues contact){
        if(position(contact) >= 0){
            System.out.println("Entry already exists...!!!");
        }
        else this.contacts.add(contact);
    }

    public int position(contactvalues contact){
        return this.contacts.indexOf(contact);
    }
}