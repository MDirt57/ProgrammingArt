package task8_3_1.original;

public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar) {
        super(sugar);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15;
    }
}
