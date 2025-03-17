package task16_3_3;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Component, Iterable<Item> {

    public Box(int id) {
        this.id = id;
    }

    private final int id;

    private final List<Component> children
            = new ArrayList<>();

    public void add(Component child){
        children.add(child);
    }

    public void remove(Component child){
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        System.out.println("Box: " + id);
        for (Component child : children) {
            child.execute();
        }
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
