package task21_3_2;

import task21_3_2.strategies.CalculatorStrategy;

public class Calculator {

    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    public int calculate(int a, int b){
        if (strategy == null){
            throw new RuntimeException("Operation was not defined");
        }
        return strategy.calculate(a, b);
    }

}
