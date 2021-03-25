package com.desing.patterns;

import com.desing.exercise.medidorDeSensores.*;
import com.desing.patterns.behavioral.nullObject.AbstractCustomer;
import com.desing.patterns.behavioral.nullObject.CustomerFactory;
import com.desing.patterns.creational.abstarcfFactory.Application;
import com.desing.patterns.creational.abstarcfFactory.factories.IGUIFactory;
import com.desing.patterns.creational.abstarcfFactory.factories.MacOSFactory;
import com.desing.patterns.creational.abstarcfFactory.factories.WindowsFactory;
import com.desing.patterns.creational.builder.Cafe;
import com.desing.patterns.creational.builder.Coffee;

import com.desing.patterns.creational.lazyInitialization.Company;
import com.desing.patterns.creational.lazyInitialization.ContactList;
import com.desing.patterns.creational.lazyInitialization.ContactListProxyImpl;
import com.desing.patterns.creational.lazyInitialization.EmployeeDAO;
import com.desing.patterns.creational.prototype.game.sinUsarClonable.Enemigo;
import com.desing.patterns.creational.prototype.game.sinUsarClonable.GestorEnemigo;
import com.desing.patterns.creational.prototype.price.PriceListImpl;
import com.desing.patterns.creational.prototype.price.ProductItem;
import com.desing.patterns.creational.prototype.price.PrototypeFactory;
import com.desing.patterns.creational.singleton.Reloj;
import com.desing.patterns.creational.singleton.RelojSingleton;
import com.desing.patterns.structural.adapter.*;
import com.desing.patterns.structural.bridge.CAbstraction;
import com.desing.patterns.structural.bridge.CImplementationC;
import com.desing.patterns.structural.bridge.IBridge;
import com.desing.patterns.structural.decorator.burgerCombos.VentanaMenu;
import com.desing.patterns.structural.decorator.clothing.components.IPersona;
import com.desing.patterns.structural.decorator.clothing.components.Persona;
import com.desing.patterns.structural.decorator.clothing.decorators.Chaqueta;
import com.desing.patterns.structural.decorator.clothing.decorators.Impermeable;
import com.desing.patterns.structural.decorator.clothing.decorators.Sueter;
import com.desing.patterns.structural.proxy.ImageProxyTestDrive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by AnDrEy on 2/19/2021.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        /**
         * Behavioral patterns
         */

        nullObject();

        /**
         * Creational patterns
         */

        abstractFActory();
        builder();
        lazyInitialization();
        protptype();
        singleton();

        /**
         * Structural patterns
         */

        adapter();
        bridge();
        decorator();
        proxy();


        /**
         * Class exercises
         */

        medidorDeSensores();


    }

    private static void bridge(){
        Map<String, Float> products = new HashMap<>();

        products.put("A101", 56.92f);
        products.put("A234", 55.82f);
        products.put("B101", 54.12f);
        products.put("A401", 53.32f);
        products.put("B345", 52.22f);
        products.put("C567", 51.42f);
        products.put("A105", 50.52f);
        products.put("C102", 49.62f);
        products.put("B701", 48.82f);
        products.put("A151", 47.32f);

        IBridge _implementation = new CImplementationC();
        CAbstraction abstraction = new CAbstraction( _implementation );

        abstraction.showProductsTotal( products );
        abstraction.showProductsList( products );

    }



    private static void decorator(){
        IPersona person = new Persona();
        person.llevarRopa();
        person = new Chaqueta(person);
        person.llevarRopa();
        person = new Sueter(person);
        person.llevarRopa();
        person = new Impermeable(person);
        person.llevarRopa();
        IPersona personaConImpermeable = new Impermeable(new Persona());
        personaConImpermeable.llevarRopa();

        VentanaMenu ventana=new VentanaMenu();
        ventana.setVisible(true);
    }



    private static void adapter() {
        // Instanciamos fuente y robot
        IFuenteDePoderColombiana fuente = new FuenteDePoderColombiana();
        Robot robot1 = new Robot(fuente);
        // Encendemos el robot
        robot1.Encender();
        System.out.println("");

        // Instanciamos la fuente Aleman, que es la que queremos adaptar.
        IFuenteDePoderEuropeo fuenteEuropeo = new FuenteDePoderAlemana();
        // Instanciamos el adaptador pasandole la fuente Alemana como parametro
        IFuenteDePoderColombiana adaptador = (IFuenteDePoderColombiana)
                new AdapterColombianoEuropeo(fuenteEuropeo);
        // Creamos el robot pasandole nuestro adaptador
        Robot robot2 = new Robot(adaptador);
        // Encendemos el taladro
        robot2.Encender();
        System.out.println("");
    }


    private static void lazyInitialization() {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("Geeksforgeeks", "India", "+91-011-28458965", contactList);
        System.out.println("CompanyDAO Name: " + company.getCompanyName());
        System.out.println("CompanyDAO Address: " + company.getCompanyAddress());
        System.out.println("CompanyDAO Contact No.: " + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");
        contactList = company.getContactList();
        List<EmployeeDAO> empList = contactList.getEmployeeList();
        for (EmployeeDAO emp : empList) {
            System.out.println(emp);
        }
    }

    private static void proxy() {
        ImageProxyTestDrive testDrive = null;
        try {
            testDrive = new ImageProxyTestDrive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        testDrive.setVisible(true);
    }

    private static void medidorDeSensores() {
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
    }

    private static void nullObject() {
        String[] names = new String[]{"Rob", "Bob", "Julie", "LauraLaura"};

        ArrayList<AbstractCustomer> customerArrayList = new ArrayList<AbstractCustomer>();
        for (String name : names) {
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


    private static void singleton() {
        ArrayList<RelojSingleton> singletonArrayList = new ArrayList<RelojSingleton>();
        ArrayList<Reloj> relojArrayList = new ArrayList<Reloj>();
        for (int i = 0; i < 2; i++) {
            singletonArrayList.add(RelojSingleton.getInstancia());
            relojArrayList.add(new Reloj());
        }
    }


    private static void abstractFActory() {
        Application app;
        IGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        app.paint();
    }


    private static void protptype() {
        System.out.println("******[ GAME ]******");
        System.out.println("======[ sinUsarClonable ]======");
        GestorEnemigo objGP = new GestorEnemigo();
        // Obtenemos el Guerrero original
        Enemigo g1 = objGP.getEnemigo("Warrior1");
        seeWarriorSinUsarClonable(g1, "El Guerrero original se llama [");
        Enemigo gClon = objGP.getClon("Warrior1");
        seeWarriorSinUsarClonable(gClon, "El Clon del Guerrero original se llama [");
        // Modificamos el Guerrero clonado
        gClon.setNombre("Warrior2");
        gClon.setArma("HACHA");
        seeWarriorSinUsarClonable(gClon, "Tras modificar el clon, ahora se llama [");

        System.out.println("======[ usandoClonable ]======");
        com.desing.patterns.creational.prototype.game.usandoClonable.GestorEnemigo objGP1 = new com.desing.patterns.creational.prototype.game.usandoClonable.GestorEnemigo();
        // Obtenemos el Guerrero original
        com.desing.patterns.creational.prototype.game.usandoClonable.Enemigo g2 = objGP1.getEnemigo("Warrior1");
        seeWarriorusandoClonable(g2, "El Guerrero original se llama [");
        com.desing.patterns.creational.prototype.game.usandoClonable.Enemigo gClon1 = objGP1.getClon("Warrior1");
        seeWarriorusandoClonable(gClon1, "El Clon del Guerrero original se llama [");
        // Modificamos el Guerrero clonado
        gClon1.setNombre("Warrior2");
        gClon1.setArma("HACHA");
        seeWarriorusandoClonable(gClon1, "Tras modificar el clon, ahora se llama [");

        System.out.println("******[ PRICE ]******");

        // Creamos la lista de precios inicial, ésta tiene los productos con
        // el precio de lista.
        PriceListImpl standarPriceList = new PriceListImpl("Standar Price List");
        for (int c = 1; c <= 5; c++) {
            ProductItem item = new ProductItem("Product " + c, c * 2);
            standarPriceList.addProductItem(item);
        }
        PrototypeFactory.addPrototype(standarPriceList.getListName(), standarPriceList);

        // Segunda lista para clientes de mayoreo a partir de la lista
        // estándar con un 10% de descuento sobre la lista de precio estándar.
        PriceListImpl wholesalePriceList = (PriceListImpl) PrototypeFactory.getPrototype("Standar Price List");
        wholesalePriceList.setListName("Wholesale Price List");
        for (ProductItem item : wholesalePriceList.getProducts()) {
            item.setPrice(item.getPrice() * 0.90);
        }
        PrototypeFactory.addPrototype(wholesalePriceList.getListName(), wholesalePriceList);

        // Tercera lista de precios para clientes VIP a partir de la lista
        // de mayoreo con 10% de descuento sobre la lista de precios de mayoreo.
        PriceListImpl vipPriceList = (PriceListImpl) PrototypeFactory.getPrototype("Wholesale Price List");
        vipPriceList.setListName("VIP Price List");
        for (ProductItem item : vipPriceList.getProducts()) {
            item.setPrice(item.getPrice() * 0.90);
        }

        // Imprimimos las listas de precio.
        System.out.println(standarPriceList);
        System.out.println(wholesalePriceList);
        System.out.println(vipPriceList);

    }

    private static void seeWarriorSinUsarClonable(Enemigo enemigo, String label) {
        System.out.println(label + enemigo.getNombre() + "]");
        System.out.println("Su arma es [" + enemigo.getArma() + "]");
        System.out.println("==============================");
    }

    private static void seeWarriorusandoClonable(com.desing.patterns.creational.prototype.game.usandoClonable.Enemigo enemigo, String label) {
        System.out.println(label + enemigo.getNombre() + "]");
        System.out.println("Su arma es [" + enemigo.getArma() + "]");
        System.out.println("==============================");
    }


    private static void builder() {
        Coffee coffee = Coffee.CoffeeBuilder().cremaBatida("cremaBatida").canela("canela").helado("helado").build();
        System.out.println(coffee.toString());

        Cafe cafe = Cafe.cafeBuilder().hielo("hielo").cremaBatida("cremaBatida").chocolate("chocolate").build();
        System.out.println(cafe.toString());

    }


}
