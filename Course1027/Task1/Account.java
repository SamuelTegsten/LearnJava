package Course1027.Task1;

public class Account {
    private double balance;
    private String name;
    private long accountID;

    public Account(String name_, long accountID, double balance) {
        name = name_;
        this.accountID = accountID;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public long getAccountID(){
        return accountID;
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String toString() {
        String info = "name: " + name + ", balance: ";
        info += String.format("%.2f, AccountID: %d", balance, accountID);
        return info;
    }
}
