package com.papatki;

public class GameScreen {

    private int height;
    private int width;

    private char[][] gameScreen;

    public GameScreen(int width, int height) {
        this.height = height;
        this.width = width;
        this.gameScreen = new char[this.height][this.width];
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }


    public void initScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.gameScreen[i][j] = ' ';
            }
        }
    }

    public void printScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.gameScreen[i][j]);
            }
            System.out.println();
        }
    }

    public void clearScreen(int x, int y) {
        this.gameScreen[y][x] = ' ';

    }

    public char getObjectOnLocation(int x, int y) {
        return this.gameScreen[y][x];
    }

    public void setObjectOnLocation(int x, int y, GameObject gameObject) {
        this.gameScreen[y][x] = gameObject.getSign();
    }


}
