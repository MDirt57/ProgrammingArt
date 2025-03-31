package task21_3_1.strategies;

public class GooglePayStrategy implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from GooglePay.");
    }
}
