package Course1027.Task1;

public class AccountMain {
    public static void main(String[] args){

        Account acc = new Account("Samuel", 123456, 1000.0);
        long accNo = acc.getAccountID();
        System.out.println("account number: " + accNo);
        System.out.println(acc.toString());
    }
}
