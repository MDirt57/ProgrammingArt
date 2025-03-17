package task16_3_2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ShopIteratorByQuantity implements Iterator<ShopItem> {

    final private List<ShopItem> collection;
    private int state;

    public ShopIteratorByQuantity(Shop shop){
        collection = shop.getItems();
        collection.sort(Comparator.comparing(ShopItem::getQuantity).reversed());
        state = 0;
    }

    @Override
    public boolean hasNext() {
        return state < collection.size();
    }

    @Override
    public ShopItem next() {
        return collection.get(state++);
    }
}
