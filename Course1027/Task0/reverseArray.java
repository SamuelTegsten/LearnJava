package Course1027.Task0;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args){

        System.out.println("Enter the number of digits in the array: ");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] numbers = new int[n];


        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter value of digit: " + i);
            numbers[i] = scan.nextInt();
        }

        System.out.println("Reverse order:");
        for(int i = n; i > 0; i--)
        {
            System.out.println(numbers[i - 1]);
        }

    }
}
