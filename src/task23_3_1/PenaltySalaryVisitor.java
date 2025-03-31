package task23_3_1;

public class PenaltySalaryVisitor implements Visitor {
    private int salesPersonPenalty = 0;
    private int managerPenalty = 0;

    public PenaltySalaryVisitor(int salesPersonPenalty, int managerPenalty){
        this.salesPersonPenalty = salesPersonPenalty;
        this.managerPenalty = managerPenalty;
    }

    @Override
    public int visit(SalesPerson salesPerson) {
        return salesPerson.getSalary() - salesPersonPenalty;
    }

    @Override
    public int visit(Manager manager) {
        return manager.getSalary() - managerPenalty;
    }
}
