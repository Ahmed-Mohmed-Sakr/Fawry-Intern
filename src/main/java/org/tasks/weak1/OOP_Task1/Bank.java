package org.tasks.weak1.OOP_Task1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public int addAccount(String accountHolderName, double balance, double interestRate) throws Exception {
        int accountNumber = accounts.size();
        Account newAccount = new SavingsAccount(accountNumber,accountHolderName, balance,interestRate);
        accounts.add(newAccount);
        return accountNumber;
    }
    public int addAccount(String accountHolderName, double balance) throws Exception {
        int accountNumber = accounts.size();
        Account newAccount = new SavingsAccount(accountNumber,accountHolderName, balance,1.0);
        accounts.add(newAccount);
        return accountNumber;
    }

    public void deposit(int accountNumber, double amount) throws Exception
    {
       if(isValidAccountNumber(accountNumber))
           accounts.get(accountNumber).deposit(amount);
    }
    public void withdraw(int accountNumber, double amount) throws Exception
    {
        if(isValidAccountNumber(accountNumber))
            accounts.get(accountNumber).withdraw(amount);
    }

    public double getAccountBalance (int accountNumber) throws Exception
    {
        if(isValidAccountNumber(accountNumber))
            return accounts.get(accountNumber).getBalance();
        return 0;
    }

    public double getAccountRate (int accountNumber) throws Exception
    {
        if(isValidAccountNumber(accountNumber))
            return ((SavingsAccount)accounts.get(accountNumber)).calculateBalanceInterest();
        return 0;
    }

    private boolean isValidAccountNumber(int accountNumber) throws Exception {
        if (accountNumber < 0) throw new Exception("Not valid account");
        if(accountNumber >= accounts.size()) throw new Exception("Account is not exist");

        return true;
    }

}
