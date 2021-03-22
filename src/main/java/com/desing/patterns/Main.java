package com.desing.patterns;

import com.desing.patterns.nullObject.AbstractCustomer;
import com.desing.patterns.nullObject.CustomerFactory;

import java.util.ArrayList;

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
     *
     * @param args
     * @throws Exception
     */
    /*public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
        testDrive.setVisible(true);
    }*/

    /**
     * MedidorDeSensores
     *
     * @param args
     */
    /*public static void main(String[] args) {
        // Creamos un medidor de sensores
        ISujeto sensores = new MedidorSensores(36.5, 98);
        // Creamos dos observadores: una ventana y un emisor de alertas.
        // Se realiza la suscripcion a traves del constructor
        IObservador ventana = new ObservadorVentana(sensores);
        IObservador alerta = new ObservadorSonido(sensores);
        // Modificamos valores del subject. Los observadores son automaticamente
        // informados y actuaran automaticamente
        ((MedidorSensores) sensores).setTemperatura(40);
        sensores.EliminarObservador(alerta);
        ((MedidorSensores) sensores).setSPO2(99);
    }*/

    /**
     * NullObject
     * @param args
     */
    public static void main(String[] args) {
        args = new String[]{"Rob", "Bob", "Julie", "LauraLaura"};

        ArrayList<AbstractCustomer> customerArrayList = new ArrayList<AbstractCustomer>();
        for (String name : args) {
            //Utilice CustomerFactory para obtener objetos RealCustomer o NullCustomer según el nombre del cliente que se le haya pasado.
            customerArrayList.add(CustomerFactory.getCustomer(name));
        }
        System.out.println("Customers");
        for (AbstractCustomer customer : customerArrayList) {
            System.out.println("*****************");
            System.out.println(customer.getName());
            System.out.println(customer.isNil());
        }
    }

}
