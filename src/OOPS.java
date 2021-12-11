//import java.util.Scanner;
public class OOPS {
    public static void main(String[] args) {
        baseburger b = new baseburger(4, 2, 1, 0, 1);
    }
}

class baseburger {
    private int roll;
    private int meat;
    private int eggs;
    private int corn;
    private int spice;
    private int price;
    private int price1;
    private int price2;
    private int price3;
    private int price4;
    private int price5;

    public baseburger(int r, int m, int t, int c, int s) {
        roll = r;
        meat = m;
        eggs = t;
        corn = c;
        spice = s;
        rolltype(roll);
        meattype(meat);
        tomato_number(eggs);
        corn_number(corn);
        spice_number(spice);
        total();
    }

    private void rolltype(int roll) {
        int price1 = 0;
        if (roll > 0 && roll < 5) {
            if (roll == 1) price1 = 10;
            else if (roll == 2) price1 = 20;
            else if (roll == 3) price1 = 30;
            else if (roll == 4) price1 = 40;
        } else {
            System.out.println(" Enter valid roll type ");
            System.exit(0);
        }
        price = price + price1;
        this.price1 = price1;
    }

    private void meattype(int meat) {
        int price2 = 0;
        if (meat > 0 && meat < 5) {
            if (meat == 1) {
                price2 = 15;
            } else if (meat == 2) {
                price2 = 25;
            } else if (meat == 3) {
                price2 = 35;
            } else if (meat == 4) {
                price2 = 45;
            }
        } else {
            System.out.println(" Enter valid meat type ");
            System.exit(0);
        }
        price = price + price2;
        this.price2 = price2;
    }

    private void tomato_number(int tomato) {
        int price3 = 0;
        if (tomato >= 0) {
            price3 = tomato * 10;
            price = price + price3;
            this.price3 = price3;
        } else {
            System.out.println(" Enter valid number of tomatoes ");
            System.exit(0);
        }
    }

    private void corn_number(int corn) {
        int price4 = 0;
        if (corn >= 0) {
            price4 = corn * 20;
            price = price + price4;
            this.price4 = price4;
        } else {
            System.out.println(" Enter valid number of corn ");
            System.exit(0);
        }
    }

    private void spice_number(int spice) {
        int price5 = 0;
        if (spice >= 0) {
            price5 = spice * 5;
            price = price + price5;
            this.price5 = price5;
        } else {
            System.out.println(" Enter valid number of tomatoes ");
            System.exit(0);
        }
    }

    private void total() {
        System.out.println("--------BREAD & MEAT--------");
        System.out.println("         TYPE    PRICE");
        System.out.println("BREAD  : " + roll + "       " + price1);
        System.out.println("MEAT   : " + meat + "       " + price2);
        System.out.println("--------  ADD-ON's  --------");
        System.out.println("TOMATO x " + eggs + "       " + price3);
        System.out.println("CORN   x " + corn + "       " + price4);
        System.out.println("SPICE  x " + spice + "       " + price5);
        System.out.println("----------------------------");
        System.out.println("TOTAL  : " + price);
    }
}

class healthyburger extends baseburger{
    private int eggs;
    private int broccoli;
    private int price;
    private int price1 =0;
    private int price2=0;
    baseburger b;
    public healthyburger( int r, int m, int e, int br ){
        super( 4, 3,0,0,0);
        eggs = e;
        broccoli = br;
        egg_number(eggs);
        broccoli_number(broccoli);
    }
    private void egg_number(int eggs) {
        int price1 = 0;
        if (this.eggs >= 0) {
            price1 = this.eggs * 10;
            price = price + price1;
            this.price1 = price1;
        } else {
            System.out.println(" Enter valid number eggs ");
            System.exit(0);
        }
    }
    private void broccoli_number(int broccoli) {
        int price2 = 0;
        if (broccoli >= 0) {
            price2 = broccoli * 10;
            price = price + price2;
            this.price2 = price2;
        } else {
            System.out.println(" Enter valid number of broccoli ");
            System.exit(0);
        }
    }
}




