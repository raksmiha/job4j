package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Mikhail Prokhorov (mailto:gorunovka93@gmail.com)
 * @version 1
 * @since 10.10.2018
 */
public class PointTest {
    /**
     * test method distance.
     */@Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * test method distance point to itself for two points.
     */@Test
    public void whenCheckItselfForTwoPoints() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     * test method distance3d.
     */@Test
    public void whenOneAndTwoAndTwoThenThree() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 2, 2);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(3D));
    }

    /**
     * test method distance3d point to itself for three points.
     */@Test
    public void whenCheckItselfForThreePoints() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(point);
        assertThat(result, is(0D));
    }

    /**
     * test method info.
     */@Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}