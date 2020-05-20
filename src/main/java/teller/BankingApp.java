package teller;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("0001", "Checking", 200.00 );
        Account account2 = new Account("0002", "Savings", 400.00);
        bank.openNewAccount("0003","Checking", 50.00);
        Scanner input = new Scanner(System.in);
        while(true){
            input.nextInt();
//            System.out.println("Press 1 to make a deposit");
//            System.out.println("Press 2 to make a withdrawal");
//            System.out.println("Press 3 to check balance");
//            System.out.println("Press 4 to close your account");
//            System.out.println("Press 5 to exit");
        }
    }
}
