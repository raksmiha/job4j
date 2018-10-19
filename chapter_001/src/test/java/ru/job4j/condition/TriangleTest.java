package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
* Class TriangleTest for testing class Triangle.
* @author Prokhorov Mikhail (mailto:gorunovka93@gmail.com)
* @since 19.10.2018
* @version $Id$
*/
public class TriangleTest {
	/**
	* Method for check method area.
	*/@Test
	public void whenAreaSetThreePointsThenTriangleArea() {
		// create three objects class Point.
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		// Create object triangle and set it obejcts of points.
		Triangle triangle = new Triangle(a, b, c);
		// calculate area.
		double result = triangle.area();
		// Get result.
		double expected = 2D;
		// Check result and expected.
		assertThat(result, closeTo(expected, 0.1));
	}
}
		