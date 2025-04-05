class Employee {
    private String empName;
    private int empID;

    public Employee(String name, int id) {
        this.empName = name;
        this.empID = id;
    }

    public void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
    }
}

public class EncapsulationWithConstructor1 {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 101);
        e.display();
    }
}