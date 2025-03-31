package task23_3_1;

public interface Visitor {

    int visit(SalesPerson salesPerson);
    int visit(Manager manager);
    default int visit(StaffList staffList){
        int salary = 0;
        for (Employee employee: staffList.getEmployees()){
            salary += employee.accept(this);
        }
        return salary;
    };

}
