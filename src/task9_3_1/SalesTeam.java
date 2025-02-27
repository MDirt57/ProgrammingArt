package task9_3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Worker {

    private final List<Worker> workers = new ArrayList<>();

    public SalesTeam(Worker... args){
        workers.addAll(Arrays.asList(args));
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public void removeWorker(Worker worker){
        workers.remove(worker);
    }

    public int payExpenses() {
        return workers.stream().mapToInt(Worker::payExpenses).sum();
    }

}
