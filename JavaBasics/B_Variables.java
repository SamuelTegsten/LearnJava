package LearnJava.JavaBasics;

public class B_Variables {
    public static void main(String[] args)
    {
        int x = 123; //Interger 32 bit 16 --> -16
        double z = 3.14; //single point datatype
        String c = "Hello World"; //Referenced datatype of string literals
        char v = '$'; //2 byte data as ASCII
        boolean q = true; //True = 1 False = 0

        System.out.println("Int: " +x + "\nDouble: "+z + "\nString: " + c + "\nChar: " + v + "\nBoolean: " +q);

        float f = 123.123f; //float type decimal number
        long t = 123456789; //64 bit single digit
        byte y = 1; // 0 - 128 size bits
        
        System.out.println("Float: " +f + "\nLong: " +t + "\nByte: " + y);
    }
    
}
