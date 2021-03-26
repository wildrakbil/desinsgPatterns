package com.desing.patterns.behavioral.state.tvRemote.pattern.context;

import com.desing.patterns.behavioral.state.tvRemote.pattern.state.State;

public class TVContext implements State {
    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
