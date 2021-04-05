package com.headfirst.strategy;

public class NonFlyable implements FlyInterface{

    @Override
    public void fly() {
        System.out.println("I can not fly so i touch the ground");
    }
}
