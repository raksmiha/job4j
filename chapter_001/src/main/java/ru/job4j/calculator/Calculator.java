package ru.job4j.calculator;


/**
 * Class Calculate для вывода надписи
 * @author prohorov
 * @since 23.07.2018
 * @version 1
 */
public class Calculator {
    /**
     * Variable result.
     */
    private double result;

    /**
     * Method add for two numbers.
     * @param first - first number.
     * @param second - second number.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method add for two numbers.
     * @param first - first number.
     * @param second - second number.
     * @param third - third number.
     */
    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    /**
     * Method add for two numbers.
     * @param first - first number.
     * @param second - second number.
     * @param third - third number.
     * @param fourth - fourth number.
     */
    public double add(double first, double second, double third, double fourth) {
        return add(
                add(first, second),
                add(third, fourth)
        );
    }

    /**
     * Method minus.
     * @param first - first number.
     * @param second - second number.
     */
    public void minus(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     * @param first - first number.
     * @param second - second number.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multi.
     * @param first - first number.
     * @param second - second number.
     */
    public void multi(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return result.
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Method main.
     * @param args - args.
     */
}