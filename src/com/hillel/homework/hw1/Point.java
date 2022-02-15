package com.hillel.homework.hw1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point point) {
        double d = Math.sqrt((Math.pow((this.getX() - point.getX()), 2)) + (Math.pow((this.getY() - point.getY()), 2)));
        return d;
    }

    @Override
    public String toString() {
        return "x = " + this.getX() + ", y = " + this.getY();
    }
}
