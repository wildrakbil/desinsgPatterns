package com.desing.patterns.nullObject;

/**
 * Created by AnDrEy on 3/15/2021.
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
