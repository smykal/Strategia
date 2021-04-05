package com.headfirst.strategy;

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
