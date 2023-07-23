package org.tasks.week1.OOP_Task1;

import java.util.Scanner;

public class BankApplication {

    private final static  Scanner scanner = new Scanner(System.in);
    public static int bankSystemOptions () throws Exception{
        System.out.println("you can make these operations in bank system");
        System.out.println("1- Add Account");
        System.out.println("2- deposit Account money");
        System.out.println("3- withdraw Account money");
        System.out.println("4- Show Account balance");
        System.out.println("5- Show Account Interest Rate");
        System.out.println("6- Exit");

        System.out.print("Enter Your Option : ");
        int bankOperation;
        try {
            bankOperation = scanner.nextInt();
        } catch (Exception e){
            throw new Exception("invalid input");
        }

        if(bankOperation < 1 || bankOperation > 6)
            throw new Exception("your number must be between 1 - 6");

        return bankOperation;
    }

    public static void addAccountOperation(Bank bank) throws Exception{
        System.out.print("Enter account holder name :");
        String accountHolderName = scanner.next();
        System.out.print("Enter account init balance :");
        double balance = scanner.nextDouble();
        System.out.print("Enter account Interest Rate :");
        double interestRate = scanner.nextDouble();

        int accountNumber = bank.addAccount(accountHolderName,balance,interestRate);
        System.out.println("Account Created Successfully your account ID: "+ accountNumber);
    }

    public static void depositAccountOperation(Bank bank) throws Exception{
        System.out.print("Enter Your Account id: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Amount to deposit: ");
        double amount = scanner.nextDouble();

        bank.deposit(accountNumber, amount);
        System.out.println("deposit Success");
    }

    public static void showAccountBalanceOperation(Bank bank) throws Exception{
        System.out.print("Enter Your Account id: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Your Account balance is: "+bank.getAccountBalance(accountNumber));
    }

    public static void showAccountInterestRateOperation(Bank bank) throws Exception{
        System.out.print("Enter Your Account id: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Your Account interest Rate is: "+bank.getAccountRate(accountNumber));
    }

    public static void withdrawAccountOperation(Bank bank) throws Exception{
        System.out.print("Enter Your Account id: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Amount to withdraw: ");
        double amount = scanner.nextDouble();

        bank.withdraw(accountNumber, amount);
        System.out.println("withdraw Success");
    }



    static {System.out.println("-------- Welcome to Bank System --------");}
    public static void main(String[] args) {

        Bank bank = new Bank();

        while (true) {
            try {
                int bankOperation = bankSystemOptions();

                if (bankOperation == 1)
                    addAccountOperation(bank);
                else if (bankOperation == 2)
                    depositAccountOperation(bank);
                else if (bankOperation == 3)
                    withdrawAccountOperation(bank);
                else if (bankOperation == 4)
                    showAccountBalanceOperation(bank);
                else if (bankOperation == 5)
                    showAccountInterestRateOperation(bank);
                else break;

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
