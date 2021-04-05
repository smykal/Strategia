package com.headfirst.strategy;

public class RocketFlyable implements FlyInterface{
    @Override
    public void fly() {
        System.out.println("I m flying like a ROCKET");
    }
}
