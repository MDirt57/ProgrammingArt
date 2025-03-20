package task16_3_3;

import java.util.Iterator;
import java.util.List;

public class BFSIterator implements Iterator<Item> {

    private List<Item> items;
    private int state;

    public BFSIterator(Box box){
//        queue = box.getChildren();  //isInstance();
        state = 0;
    }

    @Override
    public boolean hasNext() {
        return state < items.size();
    }

    @Override
    public Item next() {
        return items.get(state++);
    }
}
