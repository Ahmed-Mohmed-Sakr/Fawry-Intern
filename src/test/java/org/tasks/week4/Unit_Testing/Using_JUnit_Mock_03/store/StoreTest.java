package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.store;

import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.AccountManager;
import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.Customer;
//import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StoreTest {




    @Test void testPaymentSucceeded() {
        // Arrange
        Store store = new MyStore(new AlwaysSuccessAccountManager());
        Product product = new Product();
        product.setQuantity(10);
        Customer customer = new Customer();

        // Act
        store.buy(product, customer);

        // Assert
        assertThat(product.getQuantity()).isEqualTo(9);
    }

    static class AlwaysErrorAccountManager implements AccountManager {

        @Override
        public String deposit(Customer customer, int amount) {
            return "lol";
        }

        @Override
        public String withdraw(Customer customer, int amount) {
            return "payment failed";
        }
    }

    static class AlwaysSuccessAccountManager implements AccountManager {

        @Override
        public String deposit(Customer customer, int amount) {
            return "lolo";
        }

        @Override
        public String withdraw(Customer customer, int amount) {
            return "success";
        }
    }

}
