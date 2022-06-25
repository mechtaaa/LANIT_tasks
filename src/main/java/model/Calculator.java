package model;

public class Calculator {
    public static String execute(String[] params) {
        String operator = params[0];
        double value1;
        double value2;
        value1 = Double.parseDouble(params[1]);
        value2 = Double.parseDouble(params[2]);
        double result = calculate(operator, value1, value2);
          try{   if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
            }
        } catch (CalculatorException e) {
            System.out.println("Ошибка границы");
        }
        return String.valueOf(result);
    }


    private static double calculate(String operator, double a, double b) {
       try {
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
       } catch (CalculatorException e){
           System.out.println("Неизвестный оператор");
       }
        return a;
    }

        private static double add(double a, double b) {
        return a + b;
    }

    private static double subst(double a, double b) {
        return a - b;
    }

    private static double div(double a, double b) {
       try {
           if(b == 0){

           }
       } catch (CalculatorException e){
           System.out.println("Деление на ноль");
       }
        return a / b;
    }


    private static double mult(double a, double b) {
        return a * b;
    }
}