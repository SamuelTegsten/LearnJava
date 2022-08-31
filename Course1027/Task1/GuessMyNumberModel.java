package Course1027.Task1;

public class GuessMyNumberModel {
    private int upperLimit;
    private int guessNumber;
    private int previousNumber;

    public GuessMyNumberModel(int number){
        this.upperLimit = number;
        this.guessNumber = 0;
    }

    public void initGame(){
        guessNumber = (int) (Math.random()*upperLimit + 1);
    }

    public void setGuess(int guess){
        previousNumber = guess;
    }
}
