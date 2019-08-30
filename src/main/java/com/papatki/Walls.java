package com.papatki;

public class Walls extends GameObject {

    public Walls(char sign) {
        setSign(sign);
    }

    public void drawHorizontalWall(GameScreen gameScreen,int numberOfRows, Walls wall) {
        for (int i = 0; i < gameScreen.getWidth(); i++) {
            gameScreen.setObjectOnLocation(i, numberOfRows, wall);
        }
    }

    public void drawVerticalWall(GameScreen gameScreen, int numberOfColumns, Walls wall) {
        for (int i = 0; i < gameScreen.getHeight(); i++) {
            gameScreen.setObjectOnLocation(numberOfColumns, i, wall);
        }
    }

}
