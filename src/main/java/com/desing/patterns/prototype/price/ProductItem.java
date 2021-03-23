package com.desing.patterns.prototype.price;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class ProductItem implements IPrototype<ProductItem> {
    private String name;
    private double price;

    public ProductItem() {
    }

    public ProductItem(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }


    public ProductItem clone() {
        return new ProductItem(this.name, this.price);
    }

    public ProductItem deepClone() {
        return clone();
    }


    public String toString() {
        return "ProductItem{" + "name=" + name + ", price=" + price + '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
