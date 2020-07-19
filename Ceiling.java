package com.TheK;

public class Ceiling {

    private String paintedColor;
    private double height;

    public Ceiling(String paintedColor, double height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

    public double getHeight() {
        return height;
    }
}
