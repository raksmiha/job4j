package ru.job4j.array;

/**
 * Class Square.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 12.11.2018
 * @version 1.0
 */
public class Square {
	/**
	 * Method calculate.
	 * @param bound is size of array.
	 * @return rst.
     */
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 0; i !=bound; i++) {
			rst[i] = (int) Math.pow(i + 1, 2);
		}
		return rst;
	}
}