package task9_3_1;

public class Salesperson implements Worker {

  private final String name;
  private final int salary;

  private final Manager manager;

  public Salesperson(String name, int salary, Manager manager) {
    this.name = name;
    this.salary = salary;
    this.manager = manager;
  }

  public int payExpenses() {
    return salary;
  }

}
