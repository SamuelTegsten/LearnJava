package LearnJava.JavaBasics;

public class Q_Overload {
    public static void main(String[] args){
        int a = 5, b = 10, c = 15;
        int result;
        result = add(a,b);
        System.out.println(result);
        result = add(a,b,c);
        System.out.println(result);
    }

    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

}
