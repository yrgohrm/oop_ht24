public class Employee {
    private String name;
    private String title;
    private int monthlySalary;

    public Employee(String name, String title, int monthlySalary) {
        this.name = name;
        this.title = title;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", title=" + title + ", monthlySalary=" + monthlySalary + "]";
    }
}
