public class TwentyQuestionsView {

    public void splash() {
        System.out.println("Welcome to Twenty Questions! The game will start in a moment.");
    }

    public void welcome(){
        System.out.println("Welcome to Twenty Questions.\nPlease enter player name: ");
    }


    public void tooHigh(){
        System.out.println("Too high.");
    }

    public void tooLow(){
        System.out.println("Too low.");
    }


    public void winnerMessage(){
        //TODO student
        System.out.println("Congratulations!\n Your Guess was correct!");
    }


    public void loserMessage(){
        //TODO student
        System.out.println("You ran out of guesses. Better luck next time!\n");
    }


    public void exitGame() {
        System.out.println("Thank you for playing!\n");
    }


}