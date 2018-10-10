package ru.job4j.condition;

/**
 * Class Point для вычисления координат.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 27.07.2018
 * @version $Id$
 */
public class Point {
    /**
     * Variable x and y - our points.
     */
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method distanceTo.
     * @param that - our object with points.
     * @return distance.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}