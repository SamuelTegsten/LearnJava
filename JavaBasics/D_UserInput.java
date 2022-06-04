package LearnJava.JavaBasics;
import java.util.Scanner;

public class D_UserInput {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = scanner.nextLine();

        if(name.equals("Samuel"))
        {
            int age = 23;
            System.out.println("Your name is: "+name + " & Your age is: " + age);
        }
        else if(name != "Samuel")
        {
            System.out.println("Enter your Age: ");
            int number = scanner.nextInt();
            System.out.println("Your name is: "+name + " & Your age is: " + number);
        }

        System.out.println("Now for some more questions about you!");
        System.out.println("What is your favorite color?");
        String color = scanner.next();

        if(color.equals("blue" ) || color.equals("Blue" ) || color.equals("BLUE"))
        {
            System.out.println("Wow mine to!");
        }
        else
        {
            System.out.println("Yeah i guess thats alright :P");
        }
    }
}
