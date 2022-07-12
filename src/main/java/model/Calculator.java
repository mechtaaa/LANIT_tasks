package model;

import java.util.Objects;

public class Calculator {

    public static String execute(String[] params) {
        String operator = params[0];
        double value1;
        double value2;
        if (Objects.equals(operator, "")){
            throw new CalculatorException("Пустая строка");
        }
        if(params[2]==null || params[2].equals("two")){
            throw new CalculatorException("Второе значение не числовое");
        }
        if(params[1].equals("")){
            throw new CalculatorException("Первое значение пустая строка");
        }
        value1 = Double.parseDouble(params[1]);
        value2 = Double.parseDouble(params[2]);
        if(value1>Integer.MAX_VALUE||value1<Integer.MIN_VALUE) {
            throw new CalculatorException("Превышен порог значений для первого числа");

        }
        if(value2>Integer.MAX_VALUE||value2<Integer.MIN_VALUE) {
            throw new CalculatorException("Превышен порог значений для второго числа");

        }
        double result = calculate(operator, value1, value2);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                throw new CalculatorException("Превышен порог значений");
            }
        return String.format("%.3f", result);
    }

    private static double calculate(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subst(a, b);
            case "*":
                return mult(a, b);
            case "/":
                return div(a, b);
        }
        throw new CalculatorException("Неизвестный оператор");
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subst(double a, double b) {
        return a - b;
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }
}
