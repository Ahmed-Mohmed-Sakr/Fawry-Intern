package org.tasks.week4.Unit_Testing.Using_JUnit_Mock_03.account;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private int balance;
    private boolean creditAllowed;
    private int maxCredit = 0;
    private boolean vip;

}
