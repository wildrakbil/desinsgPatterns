package com.desing.patterns.behavioral.state.game.withPattern.context;

import com.desing.patterns.behavioral.state.game.withPattern.states.PlayerState;

public class GameContext //Context
{
    private PlayerState state = null;
    private Player player = new Player();

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void gameAction() {
        state.action(player);
        System.out.println("*****");
    }

}
