package LearnJava.JavaBasics;

import java.util.Scanner;

public class J_TwoDArrays {
    public static void main(String[] args){
        int array[][] = new int[10][10];
        int len = array.length;

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                array[i][j] = 0;
            }
        }

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                if(j % 10 == 0)
                {
                    System.out.print("\n");
                }
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println("\nYou have a 10x10 board, enter first & secound index & then a number to that tile");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1: ");
        int number1 = scanner.nextInt();
        System.out.print("2: ");
        int number2 = scanner.nextInt();
        System.out.print("New Entry: ");
        int ind = scanner.nextInt();

        array[number1][number2] = ind;

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                if(j % 10 == 0)
                {
                    System.out.print("\n");
                }
                System.out.print(array[i][j] + " ");
            }
        }

    }
}
