package org.tasks.weak1.OOP_Task1;

public class Account {
    private final int accountNumber;
    private final String accountHolderName;
    private double balance = 0;
    public static final double maxBalance = Double.MAX_VALUE ;
    public Account(int accountNumber, String accountHolderName, double balance) throws Exception
    {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (isValidDeposit(balance))
            this.balance = balance;
    }

    public double getBalance (){
        return balance;
    }
    public void deposit(double amount) throws Exception{
        if(isValidDeposit(amount))
            balance += amount;
    }
    public void withdraw(double amount) throws Exception {
        if(isValidWithdraw(amount))
            balance -= amount;
    }

    private boolean isValidDeposit(double amount)throws Exception {
        if (amount < 0)
            throw new Exception("You can't deposit negative amount of money");
        if (amount > maxBalance - balance)
            throw  new Exception("Your balance can't be more that :" + maxBalance);

        return true;
    }
    private boolean isValidWithdraw(double amount)throws Exception {
        if (amount < 0)
            throw new Exception("You can't withdraw negative amount of money");
        if (balance < amount)
            throw  new Exception("You can't withdraw more than :" + balance);

        return true;
    }
}
