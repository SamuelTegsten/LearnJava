package Course1027.Föreläsning2;

public class Account4Main {
    public static void main(String[] args){

        Account4 samuel = new Account4("Samuel", 500.0);

        System.out.println(samuel.toString());
        Account4.setInterest(0.50);
        System.out.println(samuel.toString());
    }
}
