package LearnJava.JavaBasics;
import java.lang.Math;

public class E_Arithmetics {
    public static void main (String[] args)
    {
        int x = 100; // Works like C
        x++;
        x--;
        x /= 2;
        x *= 2;
        x %= 51;
        System.out.println(x);

        double pi = 3.14159265359;

        double circle = (Math.pow(5, 2)) * pi;
        double sphere = 4 * pi * (Math.pow(5, 3)) / 3;
        double sqrt = 100;
        sqrt = (Math.sqrt(sqrt));
        System.out.println(circle + " " + sphere + " " + sqrt);

        int height = 100;
        System.out.println("Cylinder: " + height * circle);
    }
}
