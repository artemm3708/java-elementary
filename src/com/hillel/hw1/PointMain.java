package com.hillel.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointMain {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите координаты точки");
        double x = Double.parseDouble(READER.readLine());
        double y = Double.parseDouble(READER.readLine());
        Point point = new Point(x, y);

        System.out.println("Желвете ввести еще (1-да, 2-нет)");
        int choice = Integer.parseInt(READER.readLine());
        Point point1 = null;
        switch (choice) {
            case 1:
                System.out.println("Введите координаты точки");
                double x1 = Double.parseDouble(READER.readLine());
                double y1 = Double.parseDouble(READER.readLine());
                point1 = new Point(x1, y1);
            case 2:
                break;
        }

        System.out.println("Введите координаты центра круга и радиус");
        double circleCentre = Double.parseDouble(READER.readLine());
        double circleCentre2 = Double.parseDouble(READER.readLine());
        double r = Double.parseDouble(READER.readLine());
        Circle circle = new Circle(circleCentre, circleCentre2, r);

        if (circle.isPointInCircle(circle, point) == true || circle.isPointInCircle(circle, point1) == true) {
            System.out.println("Точка находится в круге");
        } else {
            System.out.println("Точка не в круге");
        }

    }

}
