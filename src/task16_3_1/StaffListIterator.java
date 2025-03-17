package task16_3_1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    final private List<Employee> collection;
    private int state;

    public StaffListIterator(StaffList collection){
        this.collection = collection.getList();
        this.collection.sort(Comparator.comparing(Employee::getName));
        state = 0;
    }

    @Override
    public boolean hasNext() {
        return state < collection.size();
    }

    @Override
    public Employee next() {
        return collection.get(state++);
    }
}
