package LearnJava.JavaBasics;

public class K_StringClass {
    public static void main(String[] args)
    {
        String name = "Samuel";
        boolean result =  name.equals("Samuel"); //Returns a 1 for equals or 0 for not
        boolean resultCase = name.equalsIgnoreCase("samuel"); //Ignores case
        int len = name.length(); //Length of string in Int
        char first = name.charAt(0); //Returns a char of a certain index
        int ind = name.indexOf("S"); //Returns place of indexed char
        boolean empty = name.isEmpty(); //Are there letters in the name
        String Upper = name.toUpperCase(); //All uppercase
        String lower = name.toLowerCase(); //All lowercase
        String trim = name.trim(); //Remove empty spaces
        String replace = name.replace('a', 'q');

        System.out.println(name + "\n" + result + "\n" + resultCase + "\n" + len + "\n" + first + "\n" + ind + "\n" + empty + "\n" + Upper + "\n" + lower + "\n" + trim + "\n" + replace);
    }
}
