package Course1027.Task1;

public class DiceMain {
    public static void main(String[] args) {

        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        System.out.println(d1.toString() + ", " + d2.toString()); // 1, 1
        d1.throwDice();
        d2.throwDice();
        System.out.println(d1.toString() + ", " + d2.toString()); // random
    }
}