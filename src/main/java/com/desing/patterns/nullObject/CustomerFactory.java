package com.desing.patterns.nullObject;

/**
 * Created by AnDrEy on 3/15/2021.
 */
public class CustomerFactory {

    public static final String[] _names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < _names.length; i++) {
            if (_names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
