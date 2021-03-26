package com.desing.patterns.behavioral.state.game.withPattern.states;


import com.desing.patterns.behavioral.state.game.withPattern.context.Player;

public interface PlayerState { //State
    void action(Player p);
}
