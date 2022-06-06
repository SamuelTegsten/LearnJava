package LearnJava.JavaBasics;

public class P_JavaMethods {
    public static void main(String[] args){
        hello();

        int x = 10, z = 20;
        int result;
        result = multiplication(x,z);

        System.out.println(result);
    }

    static void hello()
    {
        System.out.println("Hello World");
    }

    static int multiplication(int x, int z)
    {
        int result;
        result = x * z;
        return result;
    }
}
