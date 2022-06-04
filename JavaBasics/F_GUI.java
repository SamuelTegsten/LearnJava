package LearnJava.JavaBasics;
import javax.swing.JOptionPane;
public class F_GUI {
    public static void main (String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " +age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " +height + " cm");

        boolean loop = true;

        while(loop)
        {
            int choise = Integer.parseInt(JOptionPane.showInputDialog("1 for Hello world\n2 for your profile\n3 for exit"));
            switch(choise)
            {
                case 1: JOptionPane.showMessageDialog(null, "Hello World"); break;
                case 2: JOptionPane.showMessageDialog(null, "You are: " +name + "\nYour age is: " + age + "\nYour length is: " + height); break;
                case 3: JOptionPane.showMessageDialog(null, "Goodbye! :)"); loop = false;
            }
        }
    } 
}
