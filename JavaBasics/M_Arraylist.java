package LearnJava.JavaBasics;
import java.util.ArrayList;

public class M_Arraylist {
    public static void main(String[] args)
    {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Pasta");
        food.add("Parmegiano");
        food.add("Prucutto");

        food.set(0, "Pizza");
        food.remove(3);

        for(int i = 0; i < food.size(); i++)
        {
            System.out.println(food.get(i));
        }

        food.clear();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}
