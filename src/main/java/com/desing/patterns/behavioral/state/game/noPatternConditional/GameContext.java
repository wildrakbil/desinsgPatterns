package com.desing.patterns.behavioral.state.game.noPatternConditional;

public class GameContext {

    private Player player = new Player();
    public void gameAction(String state) {
        if (state.equals("healthy")) {
            player.attack();
            player.fireBumb();
            player.fireGunblade();
            player.fireLaserPistol();
        } else if (state.equals("survival")) {
            player.survive();
            player.firePistol();
        } else if (state.equals("dead")) {
            player.dead();
        }
        System.out.println("*****");
    }
}
