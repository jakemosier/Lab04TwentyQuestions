public class TwentyQuestions {

    public String nameIntroduction(String playerName){
        playerName = playerName.toUpperCase();
        String message = "May the odds be in your favor, ";
         
         if(playerName.equalsIgnoreCase("Sam")) {
            return "Hello " + playerName + ", are you up to the challenge?";
         }
         if(playerName.equalsIgnoreCase("fenris_wolf")) {
            return "Hi " + playerName + ", good luck!";
         }
        return message + playerName;
    }


    public int playGame(int guess, int num) {
        if(guess < num) {
           return -1;
        }
        if(guess > num) {
           return 1;
        }
        return 0;
    }

    public String numberInfo(int number){
        
         if(number == 7) {
            return "lucky sevens!";
         }
         if(number == 42) {
            return "the answer to life the universe and everything.";
         }
         if(number < 10) {
           if(number > 0) {
              return "a single digit.";
           }
         }
        return "a postive number";
    }

}
