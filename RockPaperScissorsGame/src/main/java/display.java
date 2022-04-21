import java.util.*;
public class display {

    static int playerOption = 0;
    static int computerOption = 0;

    public static void main(String[] args) {
        displayGame();
    }

    public static void displayGame() {
        // Select Number of rounds between 1-10
        Scanner sc = new Scanner(System.in);
        System.out.println("Select number of rounds you wish to play between 1-10");
        int numberOfRounds = sc.nextInt();
        if(numberOfRounds < 1 || numberOfRounds > 10){
            System.out.println("Incorrect number of rounds selected");
            displayGame();
        }
        //loop
        while (numberOfRounds > 0) {

            selectHand();

            gameplay.winResult(playerOption, computerOption);

            numberOfRounds--;
        }
        results();
        playAgain();
    }


    public static void results(){
        System.out.println("\n \nThe Results are:");
        System.out.println("Player Wins = " + gameplay.playerWins);
        System.out.println("Ties = " + gameplay.ties);
        System.out.println("Computer Wins = " + gameplay.computerWins);

        if(gameplay.playerWins > gameplay.computerWins){
            System.out.println("The overall Winner is Human Player");
        }
        else if (gameplay.playerWins < gameplay.computerWins){
            System.out.println("The overall Winner is Computer");
        }
        else{
            System.out.println("Game ended a Draw");
        }
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

    public static void playAgain(){
        // Does the user want to play again?
        System.out.println("\nDo you want to play again? Please type Yes or No");
        Scanner sc = new Scanner(System.in);
        String playAgain = sc.nextLine();
        if(playAgain.equals("Yes")){
            System.out.println("Starting New Game");
            gameplay.resetWins();
            displayGame();
        }
        else if(playAgain.equals("No")){
            System.out.println("Game Over, Thank you for playing");
        }
        else{
            System.out.println("Incorrect command entered, Thank you for playing");
        }
    }

    public static void selectHand(){
        // Ask Player to pick Rock Paper or Scissors
        System.out.println("Press 1 for Rock, 2 for Paper, and 3 for Scissors");
        Scanner sc = new Scanner(System.in);
        playerOption = sc.nextInt();
        if(playerOption != 1 || playerOption != 2 || playerOption != 3){
            System.out.println("Please select a number between 1 and 3");
        }
        System.out.println("Player Selected " + numberToOption(playerOption));

        // Computer Selects Random Option
        computerOption = (int) (Math.random() * (3 - 1)) + 1;
        System.out.println("Computer Selected " + numberToOption(computerOption));
    }
}
