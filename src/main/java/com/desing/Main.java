package com.desing;

import com.desing.exercise.medidorDeSensores.*;
import com.desing.patterns.behavioral.iterator.implementacion.AgregateConcrete;
import com.desing.patterns.behavioral.iterator.interfaces.MyIterator;
import com.desing.patterns.behavioral.iterpreter.Contexto;
import com.desing.patterns.behavioral.iterpreter.Expresion;
import com.desing.patterns.behavioral.iterpreter.Interprete;
import com.desing.patterns.behavioral.mediator.MediatorDemo;
import com.desing.patterns.behavioral.nullObject.AbstractCustomer;
import com.desing.patterns.behavioral.nullObject.CustomerFactory;
import com.desing.patterns.behavioral.state.alarm.context.AlertStateContext;
import com.desing.patterns.behavioral.state.alarm.state.Silent;
import com.desing.patterns.behavioral.state.game.noPatternEnum.State;
import com.desing.patterns.behavioral.state.game.withPattern.context.GameContext;
import com.desing.patterns.behavioral.state.game.withPattern.states.DeadState;
import com.desing.patterns.behavioral.state.game.withPattern.states.HealthyState;
import com.desing.patterns.behavioral.state.game.withPattern.states.SurvivalState;
import com.desing.patterns.behavioral.state.tvRemote.noPattern.TVRemoteBasic;
import com.desing.patterns.behavioral.state.tvRemote.pattern.context.TVContext;
import com.desing.patterns.behavioral.state.tvRemote.pattern.state.TVStartState;
import com.desing.patterns.behavioral.state.tvRemote.pattern.state.TVStopState;
import com.desing.patterns.behavioral.state.vehicle.conPatron.contexto.Vehiculo;
import com.desing.patterns.behavioral.state.vehicle.sinPatron.VehiculoBasico;
import com.desing.patterns.behavioral.visitor.Elemento;
import com.desing.patterns.behavioral.visitor.ElementoL;
import com.desing.patterns.behavioral.visitor.Visitante;
import com.desing.patterns.creational.abstarcfFactory.Application;
import com.desing.patterns.creational.abstarcfFactory.factories.IGUIFactory;
import com.desing.patterns.creational.abstarcfFactory.factories.MacOSFactory;
import com.desing.patterns.creational.abstarcfFactory.factories.WindowsFactory;
import com.desing.patterns.creational.builder.Cafe;
import com.desing.patterns.creational.builder.Coffee;
import com.desing.patterns.creational.lazyInitialization.Fruit;
import com.desing.patterns.creational.lazyInitialization.FruitType;
import com.desing.patterns.creational.objectPool.Store;
import com.desing.patterns.creational.objectPool.WorkSpace;
import com.desing.patterns.creational.prototype.game.sinUsarClonable.Enemigo;
import com.desing.patterns.creational.prototype.game.sinUsarClonable.GestorEnemigo;
import com.desing.patterns.creational.prototype.price.PriceListImpl;
import com.desing.patterns.creational.prototype.price.ProductItem;
import com.desing.patterns.creational.prototype.price.PrototypeFactory;
import com.desing.patterns.creational.singleton.Reloj;
import com.desing.patterns.creational.singleton.RelojSingleton;
import com.desing.patterns.structural.adapter.*;
import com.desing.patterns.structural.adapter.Robot;
import com.desing.patterns.structural.bridge.CAbstraction;
import com.desing.patterns.structural.bridge.CImplementationC;
import com.desing.patterns.structural.bridge.IBridge;
import com.desing.patterns.structural.composite.component.CompositeProduct;
import com.desing.patterns.structural.composite.component.SimpleProduct;
import com.desing.patterns.structural.composite.order.SaleOrder;
import com.desing.patterns.structural.decorator.burgerCombos.VentanaMenu;
import com.desing.patterns.structural.decorator.clothing.components.IPersona;
import com.desing.patterns.structural.decorator.clothing.components.Persona;
import com.desing.patterns.structural.decorator.clothing.decorators.Chaqueta;
import com.desing.patterns.structural.decorator.clothing.decorators.Impermeable;
import com.desing.patterns.structural.decorator.clothing.decorators.Sueter;
import com.desing.patterns.structural.flyweight.Forest;
import com.desing.patterns.structural.proxy.company.Company;
import com.desing.patterns.structural.proxy.company.ContactList;
import com.desing.patterns.structural.proxy.company.ContactListProxyImpl;
import com.desing.patterns.structural.proxy.company.EmployeeDAO;
import com.desing.patterns.structural.proxy.image.ImageProxyTestDrive;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by AnDrEy on 2/19/2021.
 */
public class Main {

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;


    public static void main(String[] args) throws Exception {

        /**
         * Behavioral patterns
         */
        //iterator();
        //interpetre();
        //mediatro();
        //nullObject();
        //state();
        //visitor();


        /**
         * Creational patterns
         */
        //abstractFActory();
        //builder();
        //lazyInitialization();
        objectPool();
        //protptype();
        //singleton();

        /**
         * Structural patterns
         */
        //adapter();
        //bridge();
        //composite();
        //decorator();
        //flyweigth();
        //proxy();

        /**
         * Class exercises
         */

        //medidorDeSensores();


    }

    private static void objectPool() {
        Store store = new Store();
        store.employWorker();
        store.OrderEquipment();
        WorkSpace obj = store.objPool.GiveEquipmentWorker();
        System.out.print("The value of the counter in the Warehouse class: " + store.objPool.counter);
        store.CheckThatWorkerWasFired(obj, true);
        System.out.print(store.workers);
        store.FireAnEmployee();
        System.out.print("The value of the counter in the Warehouse class: " + store.objPool.counter);
        store.CheckThatWorkerWasFired(obj, false);
        System.out.print(store.workers);
    }

    private static void composite() {
        SimpleProduct ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");

        CompositeProduct gammerPC = new CompositeProduct("Gammer PC");
        gammerPC.addProduct(ram4gb);

        SaleOrder gammerOrder = new SaleOrder(1, "Juan Perez");
        gammerOrder.addProduct(gammerPC);
        gammerOrder.addProduct(ram4gb);
        gammerOrder.printOrder();
    }

    private static void flyweigth() {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static void mediatro() {
        new MediatorDemo();
    }

    private static void iterator() {
        try {
            // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
            AgregateConcrete agregado = new AgregateConcrete();
            // Crear el objeto iterador para recorrer la lista
            MyIterator iterador = agregado.getIterador();
            // Mover una posición adelante y mostrar el elemento
            String obj = (String) iterador.primero();
            System.out.println(obj);
            // Mover dos posiciones adelante
            iterador.siguiente();
            iterador.siguiente();
            // Mostrar el elemento actual
            System.out.println((String) iterador.actual() + "\n");
            // Volver al principio
            iterador.primero();
            // Recorrer todo
            while (iterador.hayMas() == true) {
                System.out.println(iterador.siguiente());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void interpetre() {
        Contexto contexto = new Contexto("Osos, Leones y Tigres");
        Expresion definicion = Interprete.construirArbolInterprete();
        definicion.procesar(contexto);
        System.out.println(contexto.getOutput());
    }

    private static void state() {

        System.out.println("[********************]");
        System.out.println("[******* Game *******]");
        System.out.println("[********************]");

        System.out.println("======= withPAttren ========");
        GameContext contextWithPAttren = new GameContext();
        contextWithPAttren.setState(new HealthyState());
        contextWithPAttren.gameAction();
        contextWithPAttren.setState(new SurvivalState());
        contextWithPAttren.gameAction();
        contextWithPAttren.setState(new DeadState());
        contextWithPAttren.gameAction();


        System.out.println("======= noPatternConditional ========");
        com.desing.patterns.behavioral.state.game.noPatternConditional.GameContext contextnoPatternConditional = new com.desing.patterns.behavioral.state.game.noPatternConditional.GameContext();
        contextnoPatternConditional.gameAction("healthy");
        contextnoPatternConditional.gameAction("survival");
        contextnoPatternConditional.gameAction("dead");

        System.out.println("======= noPatternEnum ========");
        com.desing.patterns.behavioral.state.game.noPatternEnum.GameContext contextNoPatternEnum = new com.desing.patterns.behavioral.state.game.noPatternEnum.GameContext();
        contextNoPatternEnum.gameAction(State.Healthy);
        contextNoPatternEnum.gameAction(State.Survival);
        contextNoPatternEnum.gameAction(State.Dead);

        System.out.println("[***********************]");
        System.out.println("[******* vehicle *******]");
        System.out.println("[***********************]");

        System.out.println("======= VehiculoBasico ========");
        VehiculoBasico vehiculoBasico = new VehiculoBasico();
        vehiculoBasico.acelerar();
        vehiculoBasico.contacto();
        vehiculoBasico.acelerar();
        vehiculoBasico.acelerar();
        vehiculoBasico.acelerar();
        vehiculoBasico.frenar();
        vehiculoBasico.frenar();
        vehiculoBasico.frenar();
        vehiculoBasico.frenar();
        vehiculoBasico.contacto();

        System.out.println("======= Vehiculo ========");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.acelerar();
        vehiculo.contacto();
        vehiculo.acelerar();
        vehiculo.acelerar();
        vehiculo.acelerar();
        vehiculo.frenar();
        vehiculo.frenar();
        vehiculo.frenar();
        vehiculo.frenar();
        vehiculo.contacto();

        System.out.println("======= AlertStateContext ========");
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();

        System.out.println("[************************]");
        System.out.println("[******* tvRemote *******]");
        System.out.println("[************************]");

        System.out.println("======= TVRemoteBasic ========");
        TVRemoteBasic remote = new TVRemoteBasic();
        remote.setState("ON");
        remote.doAction();
        remote.setState("OFF");
        remote.doAction();

        System.out.println("======= TVContext ========");
        TVContext context = new TVContext();
        com.desing.patterns.behavioral.state.tvRemote.pattern.state.State tvStartState = new TVStartState();
        com.desing.patterns.behavioral.state.tvRemote.pattern.state.State tvStopState = new TVStopState();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();


    }

    private static void visitor() {
        double totalCosto = 0;
        int totalObjetos = 0;
        int totalClasificaciones = 0;

        //Creamos la estructura de objetos
        Elemento estructuraObjeto = new Elemento(89.0, "Botiquin",
                new Elemento(25.60, "Termometro",
                        new ElementoL(
                                new Elemento(35.8, "Antibiotico",
                                        new Elemento(15.5, "Antiacido",
                                                new ElementoL(
                                                        new Elemento(12.8, "Aspirina", null),
                                                        new Elemento(56.6, "Anti inflamatorio", null)
                                                )
                                        )
                                ),
                                new Elemento(12.8, "Gasa",
                                        new Elemento(23.5, "Cinta",
                                                new Elemento(112.5, "Tijeras", null)))
                        )
                )
        );
        //Visitamos la estructura de objetos
        Visitante visitante = new Visitante();
        visitante.ContarElementos(estructuraObjeto);

        totalCosto = visitante.getTotal();
        totalClasificaciones = visitante.getClasificaciones();
        totalObjetos = visitante.getConteo();
        System.out.println(String.format("se tienen {%d} objetos con un costo de ${%f} en {%d} clasificaciones", totalObjetos, totalCosto, totalClasificaciones));
    }

    private static void bridge() {
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
        CAbstraction abstraction = new CAbstraction(_implementation);

        abstraction.showProductsTotal(products);
        abstraction.showProductsList(products);

    }


    private static void decorator() {
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

        VentanaMenu ventana = new VentanaMenu();
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
        Fruit fruit = null;
        fruit.getFruitByTypeName(FruitType.banana);
        fruit.showAll();
        fruit.getFruitByTypeName(FruitType.apple);
        fruit.showAll();
        fruit.getFruitByTypeName(FruitType.banana);
        fruit.showAll();
    }

    private static void proxy() {
        //Image
        ImageProxyTestDrive testDrive = null;
        try {
            testDrive = new ImageProxyTestDrive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        testDrive.setVisible(true);
        //Company
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
