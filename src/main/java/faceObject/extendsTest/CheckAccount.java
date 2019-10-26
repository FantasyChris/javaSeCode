package com.suning.shangguigu.extendsTest;

public class CheckAccount extends Account {
    private double overdraft;
    public CheckAccount(int id,double balance, double annualInterestRate,double overdraft) {
        super(id,  balance,  annualInterestRate);
        this.overdraft = overdraft;
    }
    @Override
    public void withdraw(double account) {
        if (account>super.getBalance()) {
            double diff = account - super.getBalance();
            if (this.overdraft< diff) {
                System.out.println("超过可透支限额");
            }
            else {

                this.overdraft -= diff;
                super.setBalance(0);
            }
        }else {
            balance-=account;
        }
    }

    public static void main(String[] args) {
        Account account = new CheckAccount(1122, 20000, 0.045,5000);
        account.withdraw(5000);
        System.out.println("余额："+account.balance+"可透支额"+((CheckAccount) account).overdraft);
        account.withdraw(18000);
        System.out.println("余额："+account.balance+"可透支额"+((CheckAccount) account).overdraft);
        account.withdraw(3000);
        System.out.println("余额："+account.balance+"可透支额"+((CheckAccount) account).overdraft);
    }
}
