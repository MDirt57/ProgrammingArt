package task21_3_1;

import task21_3_1.strategies.BankStrategy;
import task21_3_1.strategies.GooglePayStrategy;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setStrategy(new BankStrategy());
    customer.makePayment(100);

    customer.setStrategy(new GooglePayStrategy());
    customer.makePayment(200);

  }

}
