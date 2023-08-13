package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.store;

import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.AccountManager;
import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class StoreCompleteTest {
    private MyStore myStore;
    private AccountManager mockAccountManager;
    private Customer customer;
    private Product product;

    @BeforeEach
    void init() {
        mockAccountManager = mock(AccountManager.class);
        myStore = new MyStore(mockAccountManager);
        customer = new Customer();
        product = new Product();
    }

    @Test
    void testBuyProductFromStockPaymentSuccess() {

        product.setQuantity(10);

        when(mockAccountManager.withdraw(customer, product.getPrice())).thenReturn("success");

        myStore.buy(product, customer);

        assertThat(product.getQuantity()).isEqualTo(9);
        verify(mockAccountManager).withdraw(customer, product.getPrice());
    }

    @Test
    void testBuyProductOutOfStock() {
        product.setQuantity(0);

        assertThatThrownBy(() -> myStore.buy(product, customer))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Product out of stock");
        verifyZeroInteractions(mockAccountManager);
    }

    @Test
    void testBuyPaymentFailure() {
        product.setQuantity(10);

        String paymentFailureMessage = "Payment failure: insufficient balance";
        when(mockAccountManager.withdraw(customer, product.getPrice())).thenReturn("insufficient balance");

        assertThatThrownBy(() -> myStore.buy(product, customer))
                .isInstanceOf(RuntimeException.class)
                .hasMessage(paymentFailureMessage);
        assertThat(product.getQuantity()).isEqualTo(10);
    }
}

