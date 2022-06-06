package LearnJava.JavaBasics;

import java.util.ArrayList;

public class O_ForEachLoop {
    public static void main(String[] args)
    {
        ArrayList<String> games = new ArrayList<String>();

        games.add("World of Warcraft");
        games.add("Minecraft");
        games.add("Fortnite");
        games.add("Super Mario");

        for(String i : games){
            System.out.println(i);
        }
    }
}
