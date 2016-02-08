package com.yetidogstudios.snakegram;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by andrew on 8/02/2016.
 */
public class Snake {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // For handling bird rotation
    private int width;
    private int height;

    public Snake(float x, float y, int width, int height) {

        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460);
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public Vector2 getAcceleration() {
        return acceleration;
    }

    public float getRotation() {
        return rotation;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void update(float delta) {

        velocity.add(acceleration.cpy().scl(delta));

//        if (velocity.y > 200) {
//            velocity.y = 200;
//        }

        position.add(velocity.cpy().scl(delta));

    }

    public void onClick() {

    }

}
