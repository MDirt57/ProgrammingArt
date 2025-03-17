package task16_3_1;

public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList();
    staffList.addEmployee(zak);
    staffList.addEmployee(sarah);
    staffList.addEmployee(anna);

          // TODO: Implement pattern to run commented code
//    for (Employee employee : staffList){
//      System.out.println("External: " + employee);
//      System.out.println("-----");
//      for (Employee employee1: staffList){
//        System.out.println("Internal: " + employee1);
//      }
//      System.out.println("-----");
//    }
    System.out.println(staffList.getList());

    for (Employee employee: staffList){
      System.out.println(employee);
    }

    System.out.println(staffList.getList());

  }

}
