package task16_3_2;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);
    ShopItem aaa = new ShopItem("aaa", 250);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);
    shop.putItem(aaa);

      // TODO: Implement pattern to run commented code

//    shop.setIteratorFactory(
//            new IteratorFactory() {
//              @Override
//              public Iterator<ShopItem> createIterator(Shop shop) {
//                return new ShopIteratorByName(shop);
//              }
//            }
//    );

    shop.setIteratorFactory(ShopIteratorByName::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println();

    shop.setIteratorFactory(ShopIteratorByQuantity::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

  }

}
