import java.util.Random;
import java.util.Scanner;

public class TwentyQuestionsMain {

    /**
     * Main driver for the program.
     */
    public static void main(String[] args) {
        // These are the different objects the control needs to work
        TwentyQuestionsView mainView = new TwentyQuestionsView();
        TwentyQuestions game = new TwentyQuestions();

        mainView.splash(); // The opening logo or words before the welcome screen
        mainView.welcome(); // The welcome screen. Where the game can start. 
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println(game.nameIntroduction(playerName)); //Getting the player's name
        Random random = new Random(); // Creats a random number
        int num = random.nextInt(99) + 1;
        int guessCounter = 0;
        System.out.println("A number between 1-100 has been chosen.");
        while(guessCounter < 20){
            System.out.println("Enter a guess: ");
            int guess = scanner.nextInt();
            guessCounter++;
            if(game.playGame(guess, num) == 0){ // Calls the playGame methods
                mainView.winnerMessage();
                break;
            }
            if(game.playGame(guess, num) == -1){ //Calls the playGame method
                mainView.tooLow();
            }
            else{
                mainView.tooHigh();
            }
        }
        if(guessCounter >= 20){
            mainView.loserMessage(); //displays the loser message
        }
        System.out.println("The number was " + num + ", " + game.numberInfo(num));
        mainView.exitGame(); // exits the game
    }

}