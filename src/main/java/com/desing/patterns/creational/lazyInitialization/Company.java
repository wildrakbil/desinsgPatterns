package com.desing.patterns.creational.lazyInitialization;

/**
 * Created by AnDrEy on 3/25/2021.
 */
public class Company {
    String companyName;
    String companyAddress;
    String companyContactNo;
    ContactList contactList;

    public Company(String companyName, String companyAddress,
                      String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public ContactList getContactList() {
        return contactList;
    }
}
