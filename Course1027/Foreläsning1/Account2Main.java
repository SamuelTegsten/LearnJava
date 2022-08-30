package Course1027.Foreläsning1;

public class Account2Main {
    public static void main(String[] args){
        Account2 acc = new Account2("Samuel");

        System.out.println(acc.toString());
        acc.deposit(500);
        System.out.println(acc.toString());
    }
}
