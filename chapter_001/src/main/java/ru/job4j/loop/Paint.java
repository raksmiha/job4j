package ru.job4j.loop;

/**
 * Class Paint.
 * @author Prohorov Mikhail (gorunovka93@gmail.com)
 * @since 05.11.2018
 * @version 1.0
 */
public class Paint {
	public String pyramid(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	public String leftTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= (weight - column - 1)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	public String rightTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= column) {
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