package task21_3_2.strategies;

public class Substraction implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        int res = a - b;
        System.out.printf("%s - %s = %s%n", a, b, res);
        return res;
    }
}
