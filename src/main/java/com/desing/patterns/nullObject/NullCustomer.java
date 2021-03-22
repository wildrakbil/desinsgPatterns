package com.desing.patterns.nullObject;

/**
 * Created by AnDrEy on 3/15/2021.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "El usuario no ha sido registrado";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
