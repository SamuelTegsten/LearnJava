package Course1027.Task0;

import java.util.Random;

public class lottery {
    public static void main(String[] args){
        boolean[] ticket = new boolean[35];
        int lottery = 7;

        while(lottery > 0)
        {
            int draw = (int) (Math.random()*34 + 1);
            if(ticket[draw] = true)
            {
                lottery++;
            }
            else {
                ticket[draw] = true;
            }
            lottery--;
        }
    }
}
