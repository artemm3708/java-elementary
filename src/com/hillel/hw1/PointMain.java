package com.hillel.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PointMain {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Point> points = new ArrayList<>();

        Point point = View.createPoint();

        points.add(point);

        secondPoint(points);

        Circle circle = View.createCircle();

        showPointsInCircle(points, circle);

    }

    private static void secondPoint(List<Point> points) throws IOException {
        System.out.println("Желаете ввести еще (1-да, 2-нет)");
        int choice = Integer.parseInt(READER.readLine());
        switch (choice) {
            case 1:
                Point point1 = View.createPoint();
                points.add(point1);
                secondPoint(points);
            case 2:
                break;
        }
    }

    private static void showPointsInCircle(List<Point> points, Circle circle) {
        for (Point point : points) {
            if (circle.isPointInCircle(point) == true) {
                System.out.println("Ваша точка в круге" + point);
            } else {
                System.out.println("Ваша точка не в круге" + point);
            }
        }
    }
}
