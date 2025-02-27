package task9_3_1;

public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane", 100);
    Salesperson bob = new Salesperson("Bob", 300, jane);
    Salesperson sue = new Salesperson("Sue", 200, jane);
    Salesperson johnny = new Salesperson("Cage", 2000000, jane);

    Manager meatSectorManager = new Manager("John Wick", 100000);
    meatSectorManager.addWorker(jane);
    meatSectorManager.addWorker(bob);
    meatSectorManager.addWorker(sue);
    meatSectorManager.addWorker(johnny);

    Manager milkSectorManager = new Manager("Homelander", 100);
    milkSectorManager.addWorker(jane);
    milkSectorManager.addWorker(bob);
    milkSectorManager.addWorker(sue);
    milkSectorManager.addWorker(johnny);

    Manager generalManager = new Manager("David", 50);
    generalManager.addWorker(meatSectorManager);
    generalManager.addWorker(milkSectorManager);

    System.out.println("All salary: " + generalManager.payExpenses() + "$");

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
