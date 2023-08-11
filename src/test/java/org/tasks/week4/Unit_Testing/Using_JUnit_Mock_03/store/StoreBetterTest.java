package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.store;
import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.AccountManager;
import org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account.Customer;

import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.*;


public class StoreBetterTest {


    @Test
    void test2() {
        AccountManager accountManager = mock(AccountManager.class);

        Customer customer = new Customer();
        Product product = new Product();

        when(accountManager.withdraw(eq(customer), anyInt()))
                .thenReturn("success");

        when(accountManager.withdraw(eq(customer), anyInt()))
                .then(new Answer<String>() {
                    @Override
                    public String answer(InvocationOnMock invocationOnMock) throws Throwable {
                        int amount = invocationOnMock.getArgumentAt(1, Integer.class);
                        return "SUCCESS" + amount;
                    }
                });

        System.out.println(accountManager.withdraw(customer, 10));
        System.out.println(accountManager.withdraw(customer, 11));

        verify(accountManager).withdraw(customer, 10);
        verify(accountManager).withdraw(customer, 11);
//        verify(accountManager).withdraw(customer, 12);

        verifyZeroInteractions(accountManager);

    }
}
