package com.suji.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;
    private int numOfSavingsWithdrawals = 0;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        this.checkingBalance += checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void withdrawalChecking(double withdrawalAmount) {
        if (this.checkingBalance >= withdrawalAmount) {
            this.checkingBalance -= withdrawalAmount;
            System.out.println("You have successfully withdrew $" + withdrawalAmount);
        } else {
            if (this.savingsBalance >= withdrawalAmount) {
                System.out.println("Withdrawal request has been denied. You have no sufficient balance in the checking account. Please transfer balance from you Savings account.");
            } else {
                System.out.println("Withdrawal request has been denied. You have no sufficient balance in both checking and savings accounts.");
            }

        }
    }

    public void withdrawalSaving(double withdrawalAmount) {
        if (this.savingsBalance >= withdrawalAmount) {
            this.savingsBalance -= withdrawalAmount;
            numOfSavingsWithdrawals++;
            // more than 5 withdrawals fees = $10
            if (numOfSavingsWithdrawals <= 5) {
                System.out.println("You have successfully withdrew $" + withdrawalAmount);
            } else {
                this.savingsBalance -= 10;
                System.out.println("You have successfully withdrew $" + (withdrawalAmount + 10) + " including $10 withdrawal fee.");
            }

        } else {
            if (this.checkingBalance >= withdrawalAmount) {
                System.out.println("Withdrawal request has been denied. You have no sufficient balance in the savings account. Please transfer balance from your checking account.");
            } else {
                System.out.println("Withdrawal request has been denied. You have no sufficient balance in you accounts.");
            }
        }
    }

    public void transferCheckingToSavings(double transferAmount) {
        if (this.checkingBalance >= transferAmount) {
            this.checkingBalance -= transferAmount;
            this.savingsBalance += transferAmount;
            System.out.println("You have successfully transferred $" + transferAmount + " from you checking account to savings account.");
            System.out.println("Checking account balance: $" + this.checkingBalance);
            System.out.println("Savings account balance: $" + this.savingsBalance);
        } else {
            System.out.println("Your transfer request has been denied because of insufficient balance.");
        }
    }

    public void transferSavingsToChecking(double transferAmount) {
        if (this.savingsBalance >= transferAmount) {
            this.savingsBalance -= transferAmount;
            this.checkingBalance += transferAmount;
            System.out.println("You have successfully transferred $" + transferAmount + " from you savings account to checking account.");
            System.out.println("Checking account balance: $" + this.checkingBalance);
            System.out.println("Savings account balance: $" + this.savingsBalance);
        } else {
            System.out.println("Your transfer request has been denied because of insufficient balance.");
        }
    }

    public void depositChecking(double depositAccount) {
        this.checkingBalance += depositAccount;
    }

    public void depositSavings(double depositAccount) {
        this.savingsBalance += depositAccount;
    }
}

