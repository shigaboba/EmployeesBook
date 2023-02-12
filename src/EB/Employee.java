package EB;

public class Employee {
    private final String name;
    private int department;
    private double salary;
    static int counter = 1;
    int id;

    public Employee ( String name, int department, int salary ) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО: " + this.name + ", отдел: " + this.department + ", зарплата: " + this.salary;
    }
}
