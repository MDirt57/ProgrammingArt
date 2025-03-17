package task16_3_2;

import java.util.Iterator;

public interface IteratorFactory {
    Iterator<ShopItem> createIterator(Shop shop);
}
