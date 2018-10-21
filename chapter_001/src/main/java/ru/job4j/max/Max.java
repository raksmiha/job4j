package ru.job4j.max;

/**
 * Class Max for summing two numbers.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 12.10.2018
 * @version 1.2
 */
public class Max {
    /**
     * Method max for find maximuum of two numbers.
     * @param first first number.
     * @param second second number.
     * @return answer.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
	
	/**
     * Method max for find maximuum of three numbers.
     * @param first first number.
     * @param second second number.
	 * @param second second number.
     * @return answer.
     */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}
