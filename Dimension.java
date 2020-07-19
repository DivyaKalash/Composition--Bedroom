package com.TheK;

public class Dimension {

    private double width;
    private  double depth;
    private double height;

    public Dimension(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }
}
