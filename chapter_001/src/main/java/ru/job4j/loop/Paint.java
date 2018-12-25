package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint.
 * @author Prohorov Mikhail (gorunovka93@gmail.com)
 * @since 05.11.2018
 * @version 1.0
 */
public class Paint {
	/**
	 * Method rightTrl for paint right part of piramid in string.
	 * @param height of pitamid.
	 * @return paint right part of piramid.
	 */
	public String rightTrl(int height) {
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= column);
	}

	/**
	 * Method leftTrl for paint left part of piramid in string.
	 * @param height of pitamid.
	 * @return paint left part of piramid.
	 */
	public String leftTrl(int height) {
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= height - column - 1);
	}

	/**
	 * Method pyramid for paint piramid in string.
	 * @param height of pitamid.
	 * @return paint piramid.
	 */
	public String pyramid(int height) {
		return this.loopBy(height, 2 * height - 1, (row, column) -> row >= height - column - 1 && row + height - 1 >= column);
	}

	/**
	 * Method loopBy for calculate of paint piramid in string.
	 * @param height of pitamid.
	 * @param weight of pitamid.
	 * @param predict of pitamid.
	 * @return string.
	 */
	private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}