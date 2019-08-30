package com.papatki;

public class Food extends GameObject {

    public Food(char sign) {
        setSign(sign);
    }

    //place food randomly at game screen
    public void placeFoodRandomly(GameScreen gameScreen, Food food) {
        gameScreen.setObjectOnLocation((int)(Math.random() * (gameScreen.getWidth() - 1)),
                (int)(Math.random() * (gameScreen.getHeight() - 1)), food);
    }
}
