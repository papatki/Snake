package com.papatki;

public class GameScreen {

    private int height;
    private int width;

    private char[][] gameScreen;

    public GameScreen(int height, int width) {
        this.height = height;
        this.width = width;
        this.gameScreen = new char[this.height][this.width];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void printScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                char screen = this.gameScreen[i][j] = '.';
                System.out.println(screen);
            }
        }
    }

    public char getObjectOnLocation(int x, int y, GameObject gameObject) {
        return gameScreen[x][y];
    }

    public void setObjectOnLocation(int x, int y, GameObject gameObject) {
        gameScreen[x][y] = gameObject.getSign();
    }


}
