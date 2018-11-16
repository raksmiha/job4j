package ru.job4j.array;

/**
 * Class FindLoop for practice with loop.
 * @author Prokhorov Mikhail (gorunovka93@gmai.com)
 * @since 15.11.2018
 * @version 1.0
 */
public class FindLoop {
	/**
	 * Method indexOf for find specific index of array.
	 * @param data is array of integer number.
	 * @param e1 number for our find.
     * @return rst is our index.
     */
	public int indexOf(int[] data, int e1) {
		int rst = -1;
		for (int index = 0; index != data.length; index++) {
			if (data[index] == e1) {
				rst = index;
				break;
			}
		}
		return rst;
	}
}