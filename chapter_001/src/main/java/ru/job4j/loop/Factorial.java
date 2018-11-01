package ru.job4j.loop;

/**
 * Class Factorial.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 27.10.2018
 * @version 1.0
 */
public class Factorial {
	/**
	 * Calculate factorial.
	 * @param n input number.
	 * @return factorial.
	 */
	public int calc(int n) {
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}