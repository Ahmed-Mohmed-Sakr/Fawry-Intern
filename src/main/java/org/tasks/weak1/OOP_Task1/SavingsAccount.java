package org.tasks.weak1.OOP_Task1;

public class SavingsAccount extends Account{

    private double interestRate;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) throws Exception {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateBalanceInterest() {
        double balanceInterest = (getBalance() * interestRate) / 100;

        return balanceInterest;
    }
}
