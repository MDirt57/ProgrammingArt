package task9_3_1;

import java.util.ArrayList;
import java.util.List;

public class SalesTeamBuilder {

    private final List<Manager> managers = new ArrayList<>();
    private final List<Salesperson> salespeople = new ArrayList<>();


    public SalesTeamBuilder addManager(Manager manager){
        managers.add(manager);
        return this;
    }

    public SalesTeamBuilder addSalesPerson(Salesperson salesperson){
        salespeople.add(salesperson);
        return this;
    }

    public SalesTeam build(){
        return new SalesTeam(managers, salespeople);
    }

}
