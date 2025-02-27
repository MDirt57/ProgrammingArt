package task9_3_1;

public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane", 100);
    Salesperson bob = new Salesperson("Bob", 300, jane);
    Salesperson sue = new Salesperson("Sue", 200, jane);
    Salesperson johnny = new Salesperson("Cage", 2000000, jane);

    Director lumpa = new Director("Sir David Lumpa", 1);

    SalesTeam meatSector = new SalesTeamBuilder()
            .addManager(jane)
            .addSalesPerson(bob)
            .addSalesPerson(sue)
            .addSalesPerson(johnny)
            .build();

    SalesTeam milkSector = new SalesTeamBuilder()
            .addManager(jane)
            .addSalesPerson(bob)
            .addSalesPerson(sue)
            .addSalesPerson(johnny)
            .build();

    SalesTeam sweetSector = new SalesTeamBuilder()
            .addManager(jane)
            .addSalesPerson(bob)
            .addSalesPerson(sue)
            .addSalesPerson(johnny)
            .build();

    lumpa.addSalesTeam(meatSector);
    lumpa.addSalesTeam(milkSector);
    lumpa.addSalesTeam(sweetSector);

    lumpa.payExpenses();
  }

  private static void payManager(Manager manager) {
    System.out.println("Expenses have been requested");
    manager.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void paySalesperson(Salesperson salesperson) {
    System.out.println("Expenses have been requested");
    salesperson.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team) {
    System.out.println("Expenses have been requested");
    team.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

}
