package task21_3_2;

import task21_3_2.strategies.Multiplication;
import task21_3_2.strategies.Substraction;

public class  Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Substraction());
        calculator.setStrategy(new Multiplication());

        calculator.calculate(12, 13);
    }

}
