package com.desing.patterns.behavioral.state.alarm.context;


import com.desing.patterns.behavioral.state.alarm.state.AlertState;
import com.desing.patterns.behavioral.state.alarm.state.Vibration;

public class AlertStateContext {

    private AlertState currentState;

    public AlertStateContext()
    {
        currentState = new Vibration();
    }

    public void setState(AlertState state)
    {
        currentState = state;
    }

    public void alert()
    {
        currentState.alert(this);
    }
}
