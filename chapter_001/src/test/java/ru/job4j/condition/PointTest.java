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
     * test method distanceTo.
     */ @Test
    public void whenFirstPointZeroAndOneSecondPointOneAndOneThenDistanceOne() {
        Point a = new Point(0, 1);
        Point b = new Point(1, 1);
        double result = a.distanceTo(b);
        double expected = 1D;
        assertThat(result, is(expected));
    }
}