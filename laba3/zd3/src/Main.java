class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %12s%n", "Сотрудник", "Зарплата");
        System.out.println("- - -- -- - -- - -- - -- - --");

        for (Employee emp : employees) {
            System.out.printf("%-15.15s | %12.2f%n", emp.getFullname(), emp.getSalary());
        }

        System.out.println("- - -- -- - -- - -- - -- - --");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Великий И.И.", 3000.00),
                new Employee("Красивый Т.П.", 678.00),
                new Employee("Золотухо М.О.", 9728.75),
                new Employee("Александров К.К.", 1010.33)
        };

        Report.generateReport(employees);
    }
}