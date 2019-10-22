package com.suning.shangguigu.extendsTest;

public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    public Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return  this.annualInterestRate/12;
    }

    public void withdraw(double account) {
        this.balance = balance - account;
    }

    public void deposit(double account) {
        this.balance = balance + account;
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        System.out.println("余额："+account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("余额: "+account.getBalance()+"利率："+account.getMonthlyInterestRate());

    }
}
