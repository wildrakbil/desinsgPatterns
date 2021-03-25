package com.desing.patterns.creational.prototype.price;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class PrototypeFactory {
    private static Map<String, IPrototype> prototypes = new HashMap<String, IPrototype>();

    public static IPrototype getPrototype(String prototypeName) {
        return prototypes.get(prototypeName).deepClone();
    }

    public static void addPrototype(String prototypeName, IPrototype prototype) {
        prototypes.put(prototypeName, prototype);
    }
}
