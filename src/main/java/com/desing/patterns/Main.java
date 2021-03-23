package com.desing.patterns;

import com.desing.patterns.builder.Cafe;
import com.desing.patterns.builder.Coffee;
import com.desing.patterns.prototype.game.sinUsarClonable.Enemigo;
import com.desing.patterns.prototype.game.sinUsarClonable.GestorEnemigo;
import com.desing.patterns.prototype.price.PriceListImpl;
import com.desing.patterns.prototype.price.ProductItem;
import com.desing.patterns.prototype.price.PrototypeFactory;


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
    /*public static void main(String[] args) {
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
    }*/

    /**
     * Singleton
     *
     * @param args
     */
    /*public static void main(String[] args) {

        ArrayList<RelojSingleton> singletonArrayList = new ArrayList<RelojSingleton>();
        ArrayList<Reloj> relojArrayList = new ArrayList<Reloj>();

        for (int i = 0; i < 2; i++) {
            singletonArrayList.add(RelojSingleton.getInstancia());
            relojArrayList.add(new Reloj());
        }
    }*/

    /**
     * Abstract FActory
     * @param args
     */
    /*public static void main(String[] args) {
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
    }*/


    /**
     * Protptype
     *
     * @param args
     */
    /*public static void main(String[] args) {
        System.out.println("******[ GAME ]******");
        System.out.println("======[ sinUsarClonable ]======");
        GestorEnemigo objGP = new GestorEnemigo();
        // Obtenemos el Guerrero original
        Enemigo g1 = objGP.getEnemigo("Warrior1");
        seeWarriorSinUsarClonable(g1,"El Guerrero original se llama [");
        Enemigo gClon = objGP.getClon("Warrior1");
        seeWarriorSinUsarClonable(gClon,"El Clon del Guerrero original se llama [");
        // Modificamos el Guerrero clonado
        gClon.setNombre("Warrior2");
        gClon.setArma("HACHA");
        seeWarriorSinUsarClonable(gClon,"Tras modificar el clon, ahora se llama [");

        System.out.println("======[ usandoClonable ]======");
        com.desing.patterns.prototype.game.usandoClonable.GestorEnemigo objGP1 = new com.desing.patterns.prototype.game.usandoClonable.GestorEnemigo();
        // Obtenemos el Guerrero original
        com.desing.patterns.prototype.game.usandoClonable.Enemigo g2 = objGP1.getEnemigo("Warrior1");
        seeWarriorusandoClonable(g2,"El Guerrero original se llama [");
        com.desing.patterns.prototype.game.usandoClonable.Enemigo gClon1 = objGP1.getClon("Warrior1");
        seeWarriorusandoClonable(gClon1,"El Clon del Guerrero original se llama [");
        // Modificamos el Guerrero clonado
        gClon1.setNombre("Warrior2");
        gClon1.setArma("HACHA");
        seeWarriorusandoClonable(gClon1,"Tras modificar el clon, ahora se llama [");

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

    private static void seeWarriorusandoClonable(com.desing.patterns.prototype.game.usandoClonable.Enemigo enemigo, String label) {
        System.out.println(label + enemigo.getNombre() + "]");
        System.out.println("Su arma es [" + enemigo.getArma() + "]");
        System.out.println("==============================");
    }*/

    /**
     * Builder
     * @param args
     */
    public static void main(String[] args) {
        Coffee coffee = Coffee.CoffeeBuilder().cremaBatida("cremaBatida").canela("canela").helado("helado").build();
        System.out.println(coffee.toString());

        Cafe cafe = Cafe.cafeBuilder().hielo("hielo").cremaBatida("cremaBatida").chocolate("chocolate").build();
        System.out.println(cafe.toString());

    }




}
