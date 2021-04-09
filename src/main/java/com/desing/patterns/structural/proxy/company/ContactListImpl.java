package com.desing.patterns.structural.proxy.company;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList {
    public List<EmployeeDAO> getEmployeeList() {
        return getEmpList();
    }

    private static List<EmployeeDAO> getEmpList() {
        List<EmployeeDAO> empList = new ArrayList<EmployeeDAO>(5);

        empList.add(new EmployeeDAO("Lokesh", 2565.55, "SE"));
        empList.add(new EmployeeDAO("Kushagra", 22574, "Manager"));
        empList.add(new EmployeeDAO("Susmit", 3256.77, "G4"));
        empList.add(new EmployeeDAO("Vikram", 4875.54, "SSE"));
        empList.add(new EmployeeDAO("Achint", 2847.01, "SE"));

        return empList;
    }
}