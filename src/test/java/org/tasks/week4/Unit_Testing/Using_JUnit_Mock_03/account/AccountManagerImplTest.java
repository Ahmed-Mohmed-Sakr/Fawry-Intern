package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;
public class AccountManagerImplTest {
    private AccountManagerImpl accountManager;
    private Customer customer;

    @BeforeEach
    void init(){
        accountManager = new AccountManagerImpl();
        customer = new Customer();
    }

    @Test
    void testDepositWithNegativeAmount() {

        accountManager.deposit(customer,150);
        String result = accountManager.deposit(customer, -100);

        assertThat(customer.getBalance()).isEqualTo(150);
        assertThat(result).isEqualTo("you can't deposit negative amount");
    }

    @Test
    void testDepositWithPositiveAmount() {

        accountManager.deposit(customer,200);
        String result = accountManager.deposit(customer,20);

        assertThat(customer.getBalance()).isEqualTo(220);
        assertThat(result).isEqualTo("success");
    }

    @Test
    void testDepositWithMoreThanMaxBalance() {

        accountManager.deposit(customer,200);
        accountManager.deposit(customer,500);
        String result = accountManager.deposit(customer,400);

        assertThat(customer.getBalance()).isEqualTo(700);
        assertThat(result).isEqualTo("maximum credit exceeded");
    }

    @Test
    void testWithdrawWithPositiveAmount() {

        accountManager.deposit(customer,200);

        String result = accountManager.withdraw(customer,148);

        assertThat(customer.getBalance()).isEqualTo(52);
        assertThat(result).isEqualTo("success");
    }

    @Test
    void testWithdrawWithNegativeAmount() {

        accountManager.deposit(customer,150);
        String result = accountManager.withdraw(customer, -100);

        assertThat(result).isEqualTo("you can't withdraw negative amount");
    }


    @Test
    void testWithdrawWithNegativeAmountWhileNotVipAndNotCreditAllowed() {

        customer.setVip(false);
        customer.setCreditAllowed(false);

        accountManager.deposit(customer,150);
        String result = accountManager.withdraw(customer, 200);

        assertThat(result).isEqualTo("insufficient account balance");
    }

    @Test
    void testWithdrawWithNegativeAmountWhileVipAndNotCreditAllowed() {

        customer.setVip(true);
        customer.setCreditAllowed(false);

        accountManager.deposit(customer,150);
        String result = accountManager.withdraw(customer, 200);

        assertThat(result).isEqualTo("success");
    }

    @Test
    void testWithdrawWithNegativeAmountWhileNotVipAndCreditAllowed() {

        customer.setVip(false);
        customer.setCreditAllowed(true);

        accountManager.deposit(customer,150);
        String result = accountManager.withdraw(customer, 200);

        assertThat(result).isEqualTo("success");
    }

}
