package Course1027.Foreläsning1;

public class Account1 {
    //data members/fields
    double balance;
    String name; //--> en klass i sig, text-objekt

    void deposit(double amount){
        if(amount >= 0){ //Kontroll
            balance += amount;
        }
    }

    void withdraw(double amount){
        if(amount >= 0 && amount <= balance){
            balance -= amount;
        }
    }
}
