package com.desing.patterns.behavioral.state.alarm.state;

import com.desing.patterns.behavioral.state.alarm.context.AlertStateContext;

public interface AlertState {

    void alert(AlertStateContext ctx);
}
