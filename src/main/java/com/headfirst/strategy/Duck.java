package com.headfirst.strategy;

public abstract class Duck {
    FlyInterface flyInterface;
    QwackInterface qwackInterface;
    public Duck() {
    }
    public void setFlyInterface(FlyInterface qI) {
        this.flyInterface = qI;
    }

    public void setQwackInterface(QwackInterface qI) {
        this.qwackInterface = qI;
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
