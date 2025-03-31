package task23_3_1;

public class IncreaseSalaryVisitor implements Visitor {

    private float salesPersonPercentage = 0;
    private float managerPercentage = 0;

    public IncreaseSalaryVisitor(float salesPersonPercentage, float managerPercentage){
        this.salesPersonPercentage = salesPersonPercentage;
        this.managerPercentage = managerPercentage;
    }

    @Override
    public int visit(SalesPerson salesPerson) {
        int salary = salesPerson.getSalary();
        int increasedSalary = (int) (salary + salary*salesPersonPercentage);
        salesPerson.setSalary(increasedSalary);
        return increasedSalary;
    }

    @Override
    public int visit(Manager manager) {
        int salary = manager.getSalary();
        int increasedSalary = (int) (salary + salary*managerPercentage);
        manager.setSalary(increasedSalary);
        return increasedSalary;
    }
}
