package task9_3_1;

import java.util.ArrayList;
import java.util.List;

public class Director implements Worker{

    final private List<SalesTeam> salesTeams = new ArrayList<>();

    private final String name;
    private final int salary;

    public Director(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void addSalesTeam(SalesTeam team){
        salesTeams.add(team);
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
        for (SalesTeam team: salesTeams){
            team.payExpenses();
        }
    }
}
