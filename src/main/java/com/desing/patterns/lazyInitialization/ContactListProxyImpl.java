package com.desing.patterns.lazyInitialization;

import java.util.List;

public class ContactListProxyImpl implements ContactList {
    private ContactList contactList;

    public List<EmployeeDAO> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Fetching list of employees");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}