package Course1027.Foreläsning1;

public class Account2 {
    private double balance;
    private String name;

    //constructor when an instance is created
    public Account2(String name_){
        name = name_;
        balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public String getName (){
        return name;
    }

    public void withdraw(double amount){
        if(amount >= 0 && amount <= balance){
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
        }
        else{
            System.out.println("Enter a valid amount");
        }
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("You have deposited: " + amount);
        }
        else{
            System.out.println("Enter a valid amount");
        }
    }

    public String toString(){
        String info = "name: " + name + ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }

}

