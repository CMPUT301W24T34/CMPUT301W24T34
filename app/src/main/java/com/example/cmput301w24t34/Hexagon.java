package com.example.cmput301w24t34;

public class Hexagon extends Shape {
    protected Integer width;
    protected Integer height;

    public Hexagon(Integer x, Integer y, Integer width, Integer height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
