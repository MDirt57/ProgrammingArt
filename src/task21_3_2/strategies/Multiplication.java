package task21_3_2.strategies;

public class Multiplication implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        int res = a * b;
        System.out.printf("%s * %s = %s%n", a, b, res);
        return res;
    }
}
