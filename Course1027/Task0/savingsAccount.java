package Course1027.Task0;

import java.util.Scanner;

public class savingsAccount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello & welcome to your savings account, Enter amount to check interest" + "\n" + "Amounts under 100.000kr have a interest of 0.5% per anum & amounts over have 2.5% per anum");

        double sum, interest, rest;
        sum = scan.nextDouble();

        if (sum <= 100000) {
            interest = sum * 0.005;
            sum = interest + sum;
            rest = 0;
        } else {
            rest = 100000 * 0.005;
            sum -= 100000;
            interest = (sum * 0.025) + rest;
            sum = interest + sum + 100000;
        }

        System.out.println("Your total sum after one year is " + sum + ":-" + " & your interest amounted to " + interest + ":-");
        if (sum >= 100000) {
            interest = interest - rest;
            System.out.println("Sub 100k interest is: " + rest + " Over 100k interest is: " + interest);
        }
    }
}
