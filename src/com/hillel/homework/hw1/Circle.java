package com.hillel.homework.hw1;

public class Circle {

    Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isPointInCircle(Point point) {
        double d = this.center.distanceTo(point);
        return d <= this.r;
    }
}
