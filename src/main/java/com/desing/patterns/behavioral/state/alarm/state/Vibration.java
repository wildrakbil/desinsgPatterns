package com.desing.patterns.behavioral.state.alarm.state;

import com.desing.patterns.behavioral.state.alarm.context.AlertStateContext;

public class Vibration implements AlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("vibration...");
    }
}
