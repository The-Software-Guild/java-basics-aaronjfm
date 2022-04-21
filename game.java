import java.util.*;
public class game {

    public static void main(String[] args) {
        gameplay();
    }

    public static void gameplay() {
        // Count Number of Player Wins, Ties, and Computer Wins
        int playerWins = 0;
        int ties = 0;
        int computerWins = 0;

        // Select Number of rounds between 1-10
        Scanner sc = new Scanner(System.in);
        System.out.println("Select number of rounds you wish to play between 1-10");
        int numberOfRounds = sc.nextInt();

        //loop
        while (numberOfRounds > 0) {

            // Ask Player to pick Rock Paper or Scissors
            System.out.println("Press 1 for Rock, 2 for Paper, and 3 for Scissors");
            int playerOption = sc.nextInt();
            System.out.println("Player Selected " + numberToOption(playerOption));
            // Computer Selects Random Option
            Random rand = new Random();
            int computerOption = (int) (Math.random()*(3-1)) + 1;
            System.out.println("Computer Selected " + numberToOption(computerOption));

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
            numberOfRounds--;
        }
        System.out.println("\n \n The Results are:");

        System.out.println("Player Wins = " + playerWins);
        System.out.println("Ties = " + ties);
        System.out.println("Computer Wins = " + computerWins);

        System.out.println("The overall Winner is ");
        if(playerWins > computerWins){
            System.out.print("Human Player");
        }
        else if (playerWins < computerWins){
            System.out.print("Computer");
        }
        else{
            System.out.print("Draw");
        }

        // Does the user want to play again?
        System.out.println("Do you want to play again? Please type Yes or No");
        String playAgain = sc.nextLine();
        if(playAgain.equals("Yes")){
            gameplay();
        }
        else if(playAgain.equals("No")){
            System.out.println("Gameover, Thank you for playing");
        }
        else{
            System.out.println("Incorrect command entered, Thank you for playing");
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

    public static String numberToOption(int gameNumber){
        if(gameNumber == 1){
            return "Rock";
        }
        else if(gameNumber == 2){
            return "Paper";
        }
        else {
            return "Scissors";
        }
    }
}
