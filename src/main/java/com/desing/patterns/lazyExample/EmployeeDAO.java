package com.desing.patterns.lazyExample;

public class EmployeeDAO {
    private String employeeName;

    private double employeeSalary;
    private String employeeDesignation;

    public EmployeeDAO(String employeeName,
                       double employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public String toString() {
        return "EmployeeDAO Name: " + employeeName + ", EmployeeDesignation : " + employeeDesignation + ", EmployeeDAO Salary : " + employeeSalary;
    }
}