package com.desing.patterns.creational.objectPool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnDrEy on 4/9/2021.
 */
public class Warehouse {
    private static List<WorkSpace> _availableEquipment = new ArrayList<>();
    private List<WorkSpace> _inUseEquipment = new ArrayList<>();

    public int counter = 0;
    private int MAXTotalObjects;
    private int MaxPoolSize;

    public int getMaxPoolSize() {
        return MaxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        MaxPoolSize = maxPoolSize;
    }

    private static Warehouse instance = null;

    public static Warehouse GetInstance() {
        if (instance == null) {
            instance = new Warehouse();
        } else {
            System.out.print("This is singleton!");
        }
        return instance;
    }

    public WorkSpace GiveEquipmentWorker() {
        if (_availableEquipment.size() != 0 && _availableEquipment.size() < 10) {
            WorkSpace item = _availableEquipment.get(0);
            _inUseEquipment.add(item);
            _availableEquipment.remove(0);
            counter--;
            return item;
        } else {
            WorkSpace obj = new WorkSpace();
            _inUseEquipment.add(obj);
            return obj;
        }
    }
}
