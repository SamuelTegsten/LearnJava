package Course1027.Foreläsning1;

import java.util.Scanner;

public class Account1Main {
    public static void main(String[] args){

        Account1 acc = new Account1(); //Constructor / acc --> referensvariabel
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! Welcome to your account");
        System.out.println("Enter your name: ");

        String name = scan.nextLine();
        acc.name = name;

        System.out.println("Welcome " + name);

        System.out.println("Press 1 to deposit, 2 to withdraw & 3 to check account status");

        int choise = 0;
        double money;
        while(true){
            choise = scan.nextInt();
            switch(choise)
            {
                case 1: System.out.println("Enter amount to deposit: ");
                    money = scan.nextDouble();
                acc.deposit(money);
                    break;
                case 2: System.out.println("Enter amount to withdraw: ");
                    money = scan.nextDouble();
                acc.withdraw(money);
                    break;
                case 3:
                    String info = acc.name + ", " + acc.balance;
                    System.out.println(info);
                    break;
            }
        }
    }
}