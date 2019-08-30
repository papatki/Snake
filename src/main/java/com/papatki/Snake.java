package com.papatki;

public class Snake extends GameObject {

    public Snake(int startingLocationX, int  startingLocationY, char sign) {
        setSign(sign);
        setX(startingLocationX);
        setY(startingLocationY);
    }

    //move up (W)
    public void moveUp(GameScreen gameScreen, Snake snake) {
        snake.setY(getY() - 1);
        gameScreen.setObjectOnLocation(snake.getX(),snake.getY(), snake);
        gameScreen.clearScreen(snake.getX(), snake.getY() + 1);
    }
    //move down (S)
    public void moveDown(GameScreen gameScreen, Snake snake) {
        snake.setY(getY() +1);
        gameScreen.setObjectOnLocation(snake.getX(),snake.getY(), snake);
        gameScreen.clearScreen(snake.getX(), snake.getY() - 1);
    }
    //move right (D)
    public void moveRight(GameScreen gameScreen, Snake snake) {
        snake.setX(getX() + 1);
        gameScreen.setObjectOnLocation(snake.getX(),snake.getY(), snake);
        gameScreen.clearScreen(snake.getX() - 1, snake.getY());
    }

    //move left (A)
    public void moveLeft(GameScreen gameScreen, Snake snake) {
        snake.setX(getX() - 1);
        gameScreen.setObjectOnLocation(snake.getX(),snake.getY(), snake);
        gameScreen.clearScreen(snake.getX() + 1, snake.getY());
    }

}
