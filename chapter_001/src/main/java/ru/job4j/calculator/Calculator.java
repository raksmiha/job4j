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
     * Method add.
     * @param first - first number.
     * @param second - second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
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