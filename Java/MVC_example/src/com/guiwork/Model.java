package com.guiwork;

/**
 * Created by Steven on 9/11/16.
 */
public class Model {
    private int x;

    public Model() {
        x = 0;
    }

    public Model(int x) {
        this.x = x;
    }

    public void incX() {
        x++;
    }

    public void decX() {
        x--;
    }

    public void resetX() {
        x = 0;
    }

    public int getX() {
        return x;
    }
}
