package task16_3_2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    List<ShopItem> getItems(){
        return new ArrayList<>(items.values());
    }

    private IteratorFactory iteratorFactory;

    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @NotNull
    @Override
    public Iterator<ShopItem> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }
}
