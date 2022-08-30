package Course1027.Task1;

public class Dice {
    private int value;

    public Dice(int _Dice){
        value = _Dice;
    }

    public void throwDice(){
        value = (int) (Math.random()*6 + 1);
    }

    public void getValue(){
        System.out.println("Current value for the dice is: " + value);
    }

    public void OneThousandRolls(){
        int roll = 1000;
        int[] frequency = new int[6];

        while(roll >= 0){

            int dice = (int) (Math.random()*6 + 1);
            switch(dice){
                case 1: frequency[0] += 1;
                    break;
                case 2: frequency[1] += 1;
                    break;
                case 3: frequency[2] += 1;
                    break;
                case 4: frequency[3] += 1;
                    break;
                case 5: frequency[4] += 1;
                    break;
                case 6: frequency[5] += 1;
                    break;
            }
            roll--;
        }

        for(int i = 0; i < frequency.length; i++){
            System.out.println("The frequency of value: " + (i + 1) + " is " + frequency[i]);
        }
    }

    public String toString(){
        String info = "dice value: ";
        info += String.format("%d", value);
        return info;
    }
}
