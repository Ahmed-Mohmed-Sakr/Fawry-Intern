package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account;

public class AccountManagerImpl implements AccountManager {
    private static int MAX_CREDIT = 1000;
    @Override
    public String deposit(Customer customer, int amount) {
        if (amount < 0)
            return "you can't deposit negative amount";
        else if (amount + customer.getBalance() > MAX_CREDIT)
            return "maximum credit exceeded";

        customer.setBalance(customer.getBalance() + amount);
        return "success";
    }

    @Override
    public String withdraw(Customer customer, int amount) {
        if (amount < 0)
            return "you can't withdraw negative amount";

        int expectedBalance = customer.getBalance() - amount;

        if (expectedBalance < 0) {
            if (!customer.isCreditAllowed() && !customer.isVip()) {
                return "insufficient account balance";
            }
        }
        customer.setBalance(expectedBalance);
        return "success";
    }
}
