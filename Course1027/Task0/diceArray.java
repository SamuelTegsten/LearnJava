package Course1027.Task0;

public class diceArray {
    public static void main(String[] args){
        int x;
        int counter = 1000;
        int[] diceThrows = new int[6];

        while(counter > 0)
        {
            x = (int) (Math.random()*6 + 1);
            counter--;

            switch(x){
                case 1: diceThrows[0]++;
                break;
                case 2: diceThrows[1]++;
                break;
                case 3: diceThrows[2]++;
                break;
                case 4: diceThrows[3]++;
                break;
                case 5: diceThrows[4]++;
                break;
                case 6: diceThrows[5]++;
            }
        }
        for(int i = 0; i < diceThrows.length; i++)
        {
            int y = i + 1;
            System.out.println("Number of: " + y + " is " + diceThrows[i]);
        }
    }
}
