package java_fundamentals;

public class colours {
    public static void main(String[] args) {
        char c = 'G';
        switch (c) {
            case 'Y':
                System.out.println("Y->Yellow");
                break;
            case 'G':
                System.out.println("G->Green");
                break;
            case 'O':
                System.out.println("O->Orange");
                break;
            case 'W':
                System.out.println("W->White");
                break;
            case 'R':
                System.out.println("R->Red");
                break;
            case 'B':
                System.out.println("B->Blue");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
