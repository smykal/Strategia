package com.headfirst.strategy;

import com.headfirst.strategy.fly.FlyInterface;
import com.headfirst.strategy.qwack.QwackInterface;

public abstract class Duck {
    FlyInterface flyInterface;
    QwackInterface qwackInterface;

    public Duck() {
    }

    public abstract void show();

    public void startFlying() {
        flyInterface.fly();
    }

    public void startQwack() {
        qwackInterface.qwack();
    }

    public void swim() {
        System.out.println("all duck can swim , even artificial ones");
    }

    public void setFlyInterface(FlyInterface qI) {
        this.flyInterface = qI;
    }

    public void setQwackInterface(QwackInterface qI) {
        this.qwackInterface = qI;
    }
}
