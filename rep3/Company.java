import java.util.*;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void employ(String name, String title, int monthlySalary) {
        Employee e = new Employee(name, title, monthlySalary);
        employees.add(e);
    }

    public double getAverageSalary() {
        int totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.getMonthlySalary();
        }

        return totalSalary / (double) employees.size();
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", employees=" + employees + "]";
    }
}
