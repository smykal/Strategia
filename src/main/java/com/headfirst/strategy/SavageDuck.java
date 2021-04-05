package com.headfirst.strategy;

public class SavageDuck extends Duck{

    public SavageDuck() {
        qwackInterface = new Qwack();
        flyInterface = new Flyable();
    }

    public void show() {
        System.out.println("i m savage duck");
    }
}
