package task9_3_1;

public class Manager extends SalesTeam {

    private final String name;
    private final int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int payExpenses() {
        return super.payExpenses() + salary;
    }

}
