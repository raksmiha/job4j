package ru.job4j.loop;

/**
 * Class Counter.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 25.10.2018
 * @version 1.0
 */
class Counter {
	/**
	 * Method add for summing even numbers.
	 * @param start first number.
	 * @param finish latest number.
	 * @return sum.
	 */
	int add(int start, int finish) {
		int sum = 0;
		for (; start <= finish; start++) {
			if (start % 2 == 0) {
				sum += start;
			}
		}
		return sum;
	}
}