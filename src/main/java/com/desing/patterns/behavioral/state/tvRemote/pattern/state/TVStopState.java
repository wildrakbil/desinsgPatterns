package com.desing.patterns.behavioral.state.tvRemote.pattern.state;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
