package com.desing.patterns.behavioral.state.game.withPattern.states;


import com.desing.patterns.behavioral.state.game.withPattern.context.Player;

public class SurvivalState  implements PlayerState { //ConcreteState
    @Override
    public void action(Player p) {
        p.survive();
        p.firePistol();
    }
}
