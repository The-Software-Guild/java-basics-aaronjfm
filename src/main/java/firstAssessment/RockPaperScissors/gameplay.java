package firstAssessment.RockPaperScissors;

public class gameplay {

    static int playerWins = 0;
    static int ties = 0;
    static int computerWins = 0;

    public static void winResult(int playerOption, int computerOption){
        // Count Number of Player Wins, Ties, and Computer Wins

        // Check win conditions
        if(winConditions(playerOption, computerOption).equals("Draw")){
            System.out.println("Draw");
            ties++;
        }
        else if (winConditions(playerOption, computerOption).equals("Player Win")){
            System.out.println("Player Win");
            playerWins++;
        }
        else if (winConditions(playerOption, computerOption).equals("Computer Win")){
            System.out.println("Computer Win");
            computerWins++;
        }
    }

    public static String winConditions(int playerOption, int computerOption) {
        // Win Condition Applied
        if (playerOption == computerOption) {
            // Print results and declare overall winner
            return "Draw";
        }
        else if (playerOption == 1 && computerOption == 2){
            return "Computer Win";
        }
        else if (playerOption == 1 && computerOption == 3){
            return "Player Win";
        }
        else if (playerOption == 2 && computerOption == 1){
            return "Player Win";
        }
        else if (playerOption == 2 && computerOption == 3){
            return "Computer Win";
        }
        else if (playerOption == 3 && computerOption == 1){
            return "Computer Win";
        }
        else if (playerOption == 3 && computerOption == 2){
            return "Player Win";
        }
        return "";
    }

    public static void resetWins(){
        playerWins = 0;
        ties = 0;
        computerWins = 0;
    }

}
