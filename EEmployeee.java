package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Employ {
    private int id;
    private String name;
    private String position;
    private double salary;

    public Employ(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

class EmployeeManager {
    private List<Employ> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employ e) {
        employees.add(e);
    }

    public void displayEmployees() {
        for (Employ e : employees) {
            System.out.println(e);
        }
    }
}

public class EEmployeee {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Employ e1 = new Employ(1, "Ram", "Developer", 75000);
        Employ e2 = new Employ(2, "Shyam", "Manager", 90000);
        Employ e3 = new Employ(3, "Hari", "Designer", 60000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.displayEmployees();
    }
}
