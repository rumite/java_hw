package ru.stqa.pft.sandbox_hw;

import static ru.stqa.pft.sandbox_hw.Point.distance;

public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        System.out.println("Расстояние между точками р1 (" + p1.x + "; " + p1.y + ") и p2 (" + p2.x + "; " + p2.y + ") = " + distance(p1, p2));
    }
}
