package com.desing.patterns.behavioral.state.game.noPatternEnum;

public class GameTest {

    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.gameAction(State.Healthy);
        System.out.println("*****");
        context.gameAction(State.Survival);
        System.out.println("*****");
        context.gameAction(State.Dead);
        System.out.println("*****");
    }
}
