package ru.job4j.calculate;

/**
* Class Calculate для вывода надписи
* @author prohorov
* @since 23.07.2018
* @version 1
*/
public class Calculate {
	/**
	 * Variable result.
     */
	private double result;

	/**
	 * Method add.
	 * @param first - first number.
	 * @param second - second number.
	 */
	public void add(double first, double second){
		this.result = first + second;
	}

    /**
     * Method getResult.
     * @return result.
     */
    public double getResult() {
        return this.result;
    }

	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name){
		return "Echo, echo, echo : " + name;
	}
	
	/**
	* Method main.
	* @param args - args.
	*/
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}