package LearnJava.JavaBasics;

public class G_Math {
    public static void main (String[] args)
    {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double c = Math.min(x, y);
        double v = Math.abs(y);
        double b = Math.sqrt(x);
        double n = Math.pow(x, y);

        System.out.println(z + " " + c + " " + v + " " + b + " " + n);

        double hypothenues;
        double catheterA = 10.4, catheterB = 21;

        hypothenues = Math.pow(catheterA, 2) + Math.pow(catheterB, 2);
        hypothenues = Math.sqrt(hypothenues);

        System.out.println(hypothenues);
    }
}
