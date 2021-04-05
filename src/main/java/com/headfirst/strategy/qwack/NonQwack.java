package com.headfirst.strategy.qwack;

public class NonQwack implements QwackInterface{

    @Override
    public void qwack() {
        System.out.println("silent");
    }
}
