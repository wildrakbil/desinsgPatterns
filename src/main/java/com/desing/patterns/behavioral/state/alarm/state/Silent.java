package com.desing.patterns.behavioral.state.alarm.state;

import com.desing.patterns.behavioral.state.alarm.context.AlertStateContext;

public class Silent implements AlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
