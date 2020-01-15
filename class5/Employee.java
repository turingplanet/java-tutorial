public class Employee {
    String name;
    int salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.quitJob();
        System.out.println(employee.name);
    }

    public int getSalary() {
        return salary;
    }
    public void quitJob() {
        System.out.println("I'm out!");
    }
}