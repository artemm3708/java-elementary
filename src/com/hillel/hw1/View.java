package com.hillel.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static Point createPoint() throws IOException {
        System.out.println("Введите координаты точки");
        double x = Double.parseDouble(READER.readLine());
        double y = Double.parseDouble(READER.readLine());
        return new Point(x, y);
    }

    public static Circle createCircle() throws IOException {
        System.out.println("Введите координаты центра круга и радиус");
        double circleCentre = Double.parseDouble(READER.readLine());
        double circleCentre2 = Double.parseDouble(READER.readLine());
        Point center = new Point(circleCentre, circleCentre2);
        double r = Double.parseDouble(READER.readLine());
        return new Circle(center, r);
    }

}
