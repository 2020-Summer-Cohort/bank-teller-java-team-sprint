package teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {
   Map<String, Account> accounts = new HashMap<>();

   public Collection getAllAccounts(){
       return accounts.values();
   }

   public void openNewAccount(String accountNumber, String accountType, double accountBalance){
       Account newAccount = new Account(accountNumber, accountType, accountBalance);
       accounts.put(accountNumber,newAccount);
   }

   public Account getAccount(String accountNumber){
       return accounts.get(accountNumber);
   }

   public void closeAccount(String accountNumber){
       accounts.remove(accountNumber);
   }
}
