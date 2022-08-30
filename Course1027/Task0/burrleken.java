package Course1027.Task0;

import java.util.Scanner;

public class burrleken {
    public static void main(String[] args){

        System.out.println("Enter a value for Burr in the range of 2 to 9");
        Scanner scan = new Scanner(System.in);
        int burr = scan.nextInt();

        while(burr <= 1 || burr >= 10)
        {
            System.out.println("Value for Burr must be in the range of 2 to 9");
            burr = scan.nextInt();
        }

        System.out.println("Burrtalet: " + burr);

        int range = 99;
        int counter = 0;
        for(int i = 0; i < range; i++)
        {
            if(i%10 == 0 && i != 0)
            {
                counter++;
            }

           if(burr == i - (counter * 10) || i % burr == 0 || i / 10 == burr)
           {
               System.out.println("burr");
           }
           else {
               System.out.println(i);
           }
        }
    }
}
