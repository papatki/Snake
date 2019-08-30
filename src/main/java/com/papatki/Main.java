package com.papatki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int screenWidth = 20;
        int screenHeight = 20;
        int snakeStartX = screenWidth / 4;
        int snakeStartY = screenHeight / 2;

        GameScreen gameScreen = new GameScreen(screenWidth, screenHeight);
        gameScreen.initScreen();

        Walls wallHorizontal = new Walls('|');
        wallHorizontal.drawHorizontalWall(gameScreen, 0, wallHorizontal); //first
        wallHorizontal.drawHorizontalWall(gameScreen,gameScreen.getWidth() - 1, wallHorizontal); //last

        Walls wallVertical = new Walls('-');
        wallVertical.drawVerticalWall(gameScreen, 0, wallVertical); //first
        wallVertical.drawVerticalWall(gameScreen, gameScreen.getHeight() - 1, wallVertical); //last

        Snake snake = new Snake(snakeStartX, snakeStartY, '$');
        gameScreen.setObjectOnLocation(snake.getX(), snake.getY(),snake);

        Food food = new Food('*');
        food.placeFoodRandomly(gameScreen, food);

        Scanner scanner = new Scanner(System.in);


        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*** SNAKE v1.0 ***");
            gameScreen.printScreen();
            char input = scanner.nextLine().charAt(0);
            switch (input) {
                case 'a' :
                    snake.moveLeft(gameScreen, snake);
                    break;
                case 'w' :
                    snake.moveUp(gameScreen, snake);
                    break;
                case 's' :
                    snake.moveDown(gameScreen, snake);
                    break;
                case 'd' :
                    snake.moveRight(gameScreen, snake);
                    break;

            }
        }


    }
}
