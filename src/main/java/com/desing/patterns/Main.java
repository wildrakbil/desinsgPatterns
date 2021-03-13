package com.desing.patterns;

import com.desing.patterns.proxyExample.ImageProxyTestDrive;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class Main {

    /**
     * LazyExample
     * @param args
     * @throws Exception
     */
    /*public static void main(String[] args) throws Exception {
        ContactList contactList = new ContactListProxyImpl();
        CompanyDAO company = new CompanyDAO("Geeksforgeeks", "India", "+91-011-28458965", contactList);
        System.out.println("CompanyDAO Name: " + company.getCompanyName());
        System.out.println("CompanyDAO Address: " + company.getCompanyAddress());
        System.out.println("CompanyDAO Contact No.: " + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");
        contactList = company.getContactList();
        List<EmployeeDAO> empList = contactList.getEmployeeList();
        for (EmployeeDAO emp : empList) {
            System.out.println(emp);
        }
    }*/

    /**
     * ProxyExample
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
        testDrive.setVisible(true);
    }

}
