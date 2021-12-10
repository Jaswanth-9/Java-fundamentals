public class methods {
    public static void main(String[] abc) {
        boolean game_over = true;
        int score = 100;
        int level = 5;
        int exp = 40;

        if (game_over) {
            System.out.println(" Your final score is :  " + ((exp * level) + score));
        }
        else
            System.out.println(" game not finished ");

        calculator(game_over, 200, level, 40);
        calculator( false, score,level, exp);

    }
    public static int calculator(boolean game_over, int score, int level, int exp){

        if (game_over) {
            System.out.println(" Your final score is :  " + ((exp * level) + score));
        }
        else
            System.out.println(" game not finished ");
        return 1;
    }
}
