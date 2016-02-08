package com.yetidogstudios.snakegram;

/**
 * Created by andrew on 8/02/2016.
 */
public class GameWorld {
    private Snake snake;

    public GameWorld(int midPointY) {
        snake = new Snake(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        snake.update(delta);
    }

    public Snake getSnake() {
        return snake;

    }
}
