package task21_3_1;

import task21_3_1.strategies.Strategy;

public class Customer {

  private Strategy strategy;

  public void setStrategy(Strategy strategy){
    this.strategy = strategy;
  }

  public void makePayment(int amount){
    if (strategy == null){
      throw new RuntimeException("Payment method is not chosen");
    }
    strategy.makePayment(amount);
  }


}
