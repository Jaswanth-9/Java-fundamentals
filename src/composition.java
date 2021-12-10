
public class composition{
    public static void main(String args[])
    {
        engine e = new engine(350, 3000);
    car c2 = new car(" swift", " white", e);
    bike b2 = new bike("jawa", " blue" , new engine(200, 2000));
    cellar cl2 = new cellar(c2 , b2);

    cl2.b.details();
    cl2.c.details();
    }
}


class engine{
    int cc;
    int rpm;
    public engine( int c, int r)
    {
        cc = c;
        rpm = r;
    }
    public void details(){
        System.out.println(" cc : "+cc+" "+" rpm : "+rpm);
    }
}

class bike{
    String name;
    String colour;
    engine eng;
    public bike(String n, String c, engine e)
    {
        name = n;
        colour = c;
        eng = e;
    }
    private void details1()
    {
        System.out.println(" name : "+name+"\n"+" colour : "+colour);
        eng.details();
    }

    public void details()
    {
        details1();
    }
}


class car {
    String name;
    String colour;
    engine eng;
    public car(String n, String c, engine e) {
        name = n;
        colour = c;
        eng = e;
    }

    public void details(){
        System.out.println(" name : " + name + "\n" + " colour : " + colour);
        eng.details();
    }
}


class cellar{
    car c;
    bike b;
    public cellar(car c1, bike b1){
        c = c1;
        b = b1;
    }
}