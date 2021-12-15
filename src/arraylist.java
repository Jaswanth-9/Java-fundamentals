import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        details d = new details("jaswanth", "9874563210");
       // contact contact = new contact(d.detail("jaswanth", "9874563210"));
        contact contact = new contact(d);
        contact.addcontact(d);
        contact.viewcontact();
        contact.update(0,d.detail("k","9856324"));
        contact.viewcontact();
    }
}

class details{
    private String name;
    private String number;
    public details(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getname(){
        return this.name;
    }
    public String getnumber(){
        return this.number;
    }
    public details detail(String name, String number){
        return new details(name, number);
    }
}

class contact{
    private ArrayList<details> mylist;
    private details details;
    public contact(details details){
        this.details = details;
        this.mylist = new ArrayList<details>();

    }
    public void addcontact(details details){
        if(check(details.getname()) >= 0){
            System.out.println("contact already exists");
        }
        else mylist.add(details);
    }
    public void viewcontact(){
        for(int i=0; i<mylist.size();i++){
            System.out.println(mylist.get(i).getname()+" "+mylist.get(i).getnumber());
        }
    }
    public int check(String name){
        for(int i=0;i<this.mylist.size();i++){
            details details = this.mylist.get(i);
            if(details.getname().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void update(int i, details details){
        mylist.set(i,details);
    }
}
