package com.desing.patterns.behavioral.state.game.noPatternEnum;

public class GameContext {

    private Player player = new Player();

    public void gameAction(State state) {
        switch (state) {
            case Healthy:
                player.attack();
                player.fireBumb();
                player.fireGunblade();
                player.fireLaserPistol();
                System.out.println("*****");
                break;
            case Survival:
                player.survive();
                player.firePistol();
                System.out.println("*****");
                break;
            case Dead:
                player.dead();
                System.out.println("*****");
                break;
        }
    }
}
