package com.desing.patterns.behavioral.state.game.withPattern.states;

import com.desing.patterns.behavioral.state.game.withPattern.context.Player;

public class HealthyState implements PlayerState { //ConcreteState
    @Override
    public void action(Player p) {
        p.attack();
        p.fireBumb();
        p.fireGunblade();
        p.fireLaserPistol();
    }
}
