package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String empName;
    private int deptId;
    private double salary;

    // Constructor, Getters and Setters

    public Employee(int empId, String empName, int deptId, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getDeptId() {
        return deptId;
    }
}