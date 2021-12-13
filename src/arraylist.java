import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        mobile b = new mobile(" jaswanth", " 9874563210");
        b.createcontact();
    }
}

class mobile{
    private String name;
    private String phoneno;
    public mobile( String n, String no){
        name = n;
        phoneno = no;
    }
    public mobile createcontact(){
        return new mobile(name, phoneno);
    }
}
