package com.headfirst.strategy;

public class NonQwack implements QwackInterface{

    @Override
    public void qwack() {
        System.out.println("silent");
    }
}
