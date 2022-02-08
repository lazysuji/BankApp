package com.suji.bank_app;

public class BankApp {

    public static void main(String[] args) {
        //Test methods
        BankAccount customerAcct = new BankAccount(200, 300);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
//        customerAcct.withdrawalChecking(50);
//        customerAcct.withdrawalSaving(20);
//        System.out.println(customerAcct.getCheckingBalance());
//        System.out.println(customerAcct.getSavingsBalance());
//
//        // Withdrawals denied
//        customerAcct.withdrawalChecking(200);
//        customerAcct.withdrawalSaving(300);
//        System.out.println(customerAcct.getCheckingBalance());
//        System.out.println(customerAcct.getSavingsBalance());
//
//        // Transfer funds
//        customerAcct.transferCheckingToSavings(50);
//        customerAcct.transferCheckingToSavings(200);
//
//        customerAcct.transferSavingsToChecking(100);
//        customerAcct.transferSavingsToChecking(500);
//
//        // deposit fund
//        customerAcct.depositChecking(5000);
//        customerAcct.depositSavings(10000);
//        System.out.println(customerAcct.getCheckingBalance());
//        System.out.println(customerAcct.getSavingsBalance());

        // Savings account withdrawal fees
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        customerAcct.withdrawalSaving(10);
        System.out.println(customerAcct.getSavingsBalance());

    }
}
