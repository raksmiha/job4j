package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Class Point for create points.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 25.05.2019
 * @version 1.1
 */

public class Point {
    private int x;
    private int y;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Method distance for calculate distance between two points.
     * @param that second point
     * @return distance
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Method info print in console coordinats of point.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}