package java_fundamentals;

public class male_female {
    public static void main(String[] args) {
        String gender = "Male";
        int age = 60;
        if (gender == ("Male") || gender == ("Female")) {
            if (age > 0 && age < 100) {
                if ((gender == "Female") && (age >= 1 && age <= 58)) {
                    System.out.println("Interest == 8.2%");
                } else if ((gender == "Female") && (age >= 59 && age <= 100)) {
                    System.out.println("Interest == 9.2%");
                } else if ((gender == "Male") && (age >= 1 && age <= 58)) {
                    System.out.println("Interest == 8.4%");
                } else if ((gender == "Male") && (age >= 59 && age <= 100)) {
                    System.out.println("Interest == 10.5%");
                }
            } else
                System.out.println(" invalid age ");
        } else {
            System.out.println(" invalid gender");
        }
    }
}
