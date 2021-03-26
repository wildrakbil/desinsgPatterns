package com.desing.patterns.behavioral.state.tvRemote.pattern.state;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");

    }
}
