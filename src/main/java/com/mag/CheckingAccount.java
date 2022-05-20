package com.mag;

public class CheckingAccount {
    public double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public CheckingAccount(long balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdrawal(double amount){
        this.balance -= amount;
    }
}
