package task16_3_1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    List<Employee> getList(){
        return new ArrayList<>(employees);
    }

    @NotNull
    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }
}
