package ru.job4j.array;

/**
 * Class Check.
 * @author Prokjorov Mikhail (gorunovka93@gmail.com)
 * @since 18.11.2018
 * @version 1.0
 */
public class Check {
	/**
	 * Method mono for working with boolean and array.
	 * @param data is array of boolean.
	 * @return result is result out cheking.
	 */
	public boolean mono(boolean[] data) {
		boolean result = false;
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i - 1]) {
				result = true;
			}
			else {
				result = false;
				break;
			}
		}
		return result;
	}
}
 