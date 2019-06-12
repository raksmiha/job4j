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
    private int z;

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
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Method distance for calculate distance between three points.
     * @param that second point
     * @return distance
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    /**
     * Method info print in console coordinats of point.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    /**
     * Method info3d print in console coordinats of point.
     */
    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}