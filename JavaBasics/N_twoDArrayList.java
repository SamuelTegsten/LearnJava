package LearnJava.JavaBasics;

import java.util.ArrayList;
import java.util.*;

public class N_twoDArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> shoppingList = new ArrayList();

        shoppingList.add("Watermelon");
        shoppingList.add("2 Icecream");
        shoppingList.add("Toilett deterent");
        shoppingList.add("Soda");

        ArrayList<String> todolist = new ArrayList();

        todolist.add("Clean livingroom");
        todolist.add("Clean kitchen");
        todolist.add("Make dinner");
        todolist.add("Learn Java");

        ArrayList<ArrayList<String>> workOrder = new ArrayList();
        workOrder.add(shoppingList);
        workOrder.add(todolist);

        System.out.println(workOrder);
    }
}
