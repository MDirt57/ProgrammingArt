package task8_3_1;

import task8_3_1.beverages.*;
import task8_3_1.ingredients.*;

import java.util.List;

import static task8_3_1.ingredients.Sugar.sugar;

public class Cafe {

    public static void main(String[] args) {
//        BlackChocolate blackChocolate = new BlackChocolate(3, 200);
//        BlackCoffee blackCoffee = new BlackCoffee(3, 200, true);
//        BlackTee blackTee = new BlackTee(0, 300);

        Beverage blackChocolate = new Chocolate("blackChocolate", List.of(new Sugar(3), new Water(200)));
        Beverage blackCoffee = new Coffee("blackCoffee", List.of(new Sugar(3), new Water(200), new ExtraCoffee(100)));
        Beverage blackTea = new Tea("blackTea", List.of(new Water(300)));

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTea);

//        MilkChocolate milkChocolate = new MilkChocolate(3, 200);
//        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(3, 200);
//        TeeWithMilk teeWithMilk = new TeeWithMilk(2, 300);

        Beverage milkChocolate = new Chocolate("milkChocolate", List.of(new Sugar(3), new Milk(200)));
        Beverage coffeeWithMilk = new Coffee("coffeeWithMilk", List.of(new Sugar(3), new Milk(200)));
        Beverage teaWithMilk = new Tea("teaWithMilk", List.of(new Sugar(2), new Milk(300)));


        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teaWithMilk);

        Beverage moxitoWithMilk = new Moxito("moxitoWithMilk", List.of(sugar(), new Milk(100), new Water(200), new Lime(40), new Mint(50)));

        beverageInfo(moxitoWithMilk);

    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
