package LearnJava.JavaBasics;
import java.util.Random;
import java.util.Scanner;

public class H_Random {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generate a random number from number: ");
        System.out.print("1: ");
        int number = scanner.nextInt();

        int rand = random.nextInt(number + 1);
        System.out.println("Number generated was: " + rand);
    }
}