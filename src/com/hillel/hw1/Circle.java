package com.hillel.hw1;

public class Circle {

    double x;
    double y;
    double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public boolean isPointInCircle(Circle circle, Point point) {
        double d = Math.sqrt((Math.pow((circle.x - point.x), 2)) + (Math.pow((circle.y - point.y), 2)));
        if (d <= circle.r) {
            return true;
        } else {
            return false;
        }
    }
}
