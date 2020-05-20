package teller;

public class Account {
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    Account(String accountNumber, String accountType, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountType(){
        return accountType;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public double deposit(double amountToDeposit){
        accountBalance = accountBalance + amountToDeposit;
        return accountBalance;
    }

    public double withdrawal(double amountToWithDrawal){
        accountBalance = accountBalance - amountToWithDrawal;
        return accountBalance;
    }

    public double checkAccountBalance(){
        return accountBalance;
    }


}
