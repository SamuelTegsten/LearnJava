package LearnJava.JavaBasics;

public class C_VariablesSwap {
    public static void main(String[] args)
    {
        String z = "Hello"; //It's posible to pass references to each other
        String x = "World"; //Like a miracle from a C programmer x)
        String temp;

        temp = x; 
        x = z; 

        System.out.println(x + " " + temp);

        int a = 5;
        int b = 10;
        float c = a;
        double d = b;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
    
}