package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.store;

import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.AccountManager;
import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.Customer;

public class MyStore implements Store {

    AccountManager accountManager;

    public MyStore(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void buy(Product product, Customer customer) {
        if (product.getQuantity() == 0) {
            throw new RuntimeException("P6sakrtock");
        }

        String status = accountManager.withdraw(customer, product.getPrice());
        if (!status.equals("success")) {
            throw new RuntimeException("Payment failure: " + status);
        }
        product.setQuantity(product.getQuantity() - 1);
    }
}
