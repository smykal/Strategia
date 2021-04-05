package com.headfirst.strategy;

import com.headfirst.strategy.fly.NonFlyable;
import com.headfirst.strategy.qwack.Qwack;

public class SampleDuck extends Duck {
    public SampleDuck() {
        flyInterface = new NonFlyable();
        qwackInterface = new Qwack();
    }

    @Override
    public void show() {
        System.out.println("i m sample duck");
    }
}
