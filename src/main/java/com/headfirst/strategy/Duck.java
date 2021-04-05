package com.headfirst.strategy;

public abstract class Duck {
    FlyInterface flyInterface;
    QwackInterface qwackInterface;
    public Duck() {
    }

    public abstract void show();

    public void startFlying() { flyInterface.fly(); }

    public void startQwack() {
        qwackInterface.qwack();
    }

    public void swim() {
        System.out.println("all duck can swim , even artificial ones");
    }
}
