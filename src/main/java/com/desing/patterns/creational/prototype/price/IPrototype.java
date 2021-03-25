package com.desing.patterns.creational.prototype.price;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public interface IPrototype<T extends IPrototype> extends Cloneable{
    public T clone();
    public T deepClone();
}
