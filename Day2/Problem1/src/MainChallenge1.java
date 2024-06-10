public class MainChallenge1 {
    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Marley", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("jkd", highScorePosition);

    }

    public static void displayHighScorePosition (String playerName,int highScorePosition){
            System.out.println(playerName + " Managed to get into position "
                    + highScorePosition + " on the HighScore List");
        }

        public static int calculateHighScorePosition ( int playerScore){
        int position =4;
            if (playerScore >= 1000) {

                position = 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                position = 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                position = 3;
            }

            return position;
        }
    }






