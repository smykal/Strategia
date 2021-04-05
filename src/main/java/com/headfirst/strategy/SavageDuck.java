package com.headfirst.strategy;

import com.headfirst.strategy.fly.Flyable;
import com.headfirst.strategy.qwack.Qwack;

public class SavageDuck extends Duck{

    public SavageDuck() {
        qwackInterface = new Qwack();
        flyInterface = new Flyable();
    }

    public void show() {
        System.out.println("i m savage duck");
    }
}
