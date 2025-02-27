package task9_3_1;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Worker {

    private final List<Manager> managers;
    private final List<Salesperson> salespeople;

    public SalesTeam(List<Manager> managers, List<Salesperson> salespeople){
        this.managers = managers;
        this.salespeople = salespeople;
    }

//    void addManager(Manager manager) {
//        managers.add(manager);
//    }
//
//    void addSalesperson(Salesperson salesperson) {
//        salespeople.add(salesperson);
//    }

    public void payExpenses() {
        for (Manager manager : managers) {
            manager.payExpenses();
        }

        for (Salesperson salesperson : salespeople) {
            salesperson.payExpenses();
        }
    }

}
