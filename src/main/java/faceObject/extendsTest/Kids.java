package com.suning.shangguigu.extendsTest;

public class Kids extends ManKind {
    private int yearsOld;
    public void printAge() {
        System.out.println(yearsOld);
    }

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.manOrWorman(1);
        someKid.employeed(1);
        someKid.printAge();
someKid.setSalary(0);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
