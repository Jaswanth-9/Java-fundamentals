public class if_code {
    public static void main( String[] abc ){
        int score = 1000;
        int exp = 50;
        int level = 5;
        boolean game_over = false;

        if(game_over){
            int final_score = score + ( exp * level);
            System.out.println(" the final score = " + final_score);
            if(score < 500 || exp < 100) {
                System.out.println(" can do better ");
            }
            else{
                    System.out.println("well done...!!!");
                }
        }
        else{
            System.out.println(" game still exists ");
        }
    }
}
