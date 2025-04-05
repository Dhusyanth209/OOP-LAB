
// Question 4: Create an abstract class Employee with abstract method calculateSalary().
// Implement subclasses FullTimeEmployee and PartTimeEmployee with their own salary calculations.

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;
    
    FullTimeEmployee(double salary) {
        this.salary = salary;
    }
    
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee ft = new FullTimeEmployee(5000);
        System.out.println("Full-time employee salary: $" + ft.calculateSalary());
        
        Employee pt = new PartTimeEmployee(20, 80);
        System.out.println("Part-time employee salary: $" + pt.calculateSalary());
    }
}
