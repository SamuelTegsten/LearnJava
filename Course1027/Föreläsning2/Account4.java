package Course1027.Föreläsning2;

public class Account4 {
    private double balance;
    private String name;
    private static double interest = 0.25;

    public Account4(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public static double getInterest(){
        return interest;
    }

    public static void setInterest(double newInterest){
        interest = newInterest;
    }

    @Override
    public String toString() {
        return "Account4 { " +
                " balance = " + balance +
                " , name = '" + name + '\'' +
                " , Interest= " + interest + ' ' +
                '}';
    }
}
