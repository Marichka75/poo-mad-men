package org.example;

import java.util.ArrayList;

public class Agency {
    private String name;
    private ArrayList<Employee> employees;

    public Agency(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        System.out.println("Employees at " + name + ":");
        for (Employee e : employees) {
            e.introduce();
            e.work();
        }
    }
}

