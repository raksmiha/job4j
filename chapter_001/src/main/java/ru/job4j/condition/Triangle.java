package ru.job4j.condition;

/**
 * Class Triangle for working with points, area and another class.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 15.10.2018
 * @version $Id$
 */
public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	* Method for calculate half of period.
	*
	* @param ab distance between points a and b.
	* @param ac distance between points a and c.
	* @param bc distance between points b and c.
	* @return half of period.
	*/
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2;
	}
	
	/**
	* Method for returing area of triangle.
	*
	* @return return area if triangle exist.
	*/
	public double area() {
		double rsl = -1;
		double ab = this.a.distance(this.b);
		double ac = this.a.distance(this.c);
		double bc = this.b.distance(this.c);
		double p = this.period(ab, ab, bc);
		if (this.exist(ab, ac, bc)) {
			rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		}
		return rsl;
	}
	
	/**
	* Method check is triangle exist with ab, bc, ac.
	* If a+b>c, a+c>b, b+c>a, (a>0, b>0, c>0) then triangle is exist.
	*
	* @param ab length from a to b.
	* @param ac length from a to c.
	* @param bc length from b to c.
	* @return true if triangle is exist.
	*/
	private boolean exist(double ab, double ac, double bc) {
		if ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab)) {
			return true;
		}
		return false;
	}
}