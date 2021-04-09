package com.desing.patterns.creational.objectPool;

/**
 * Created by AnDrEy on 4/9/2021.
 */
public class Store {
    public int workers;
    public Warehouse objPool;

    public void employWorker() {
        workers++;
    }

    public void OrderEquipment() {
        objPool = Warehouse.GetInstance();
        objPool.setMaxPoolSize(1);
    }

    public int employees() {
        return workers;
    }

    public void FireAnEmployee() {
        workers--;
        objPool.GiveEquipmentWorker();
    }

    public void CheckThatWorkerWasFired(WorkSpace obj, boolean ifEmployeeWorker) {
        if (ifEmployeeWorker == true) {
            obj.IfWorkerWasEmployed();
        } else if (ifEmployeeWorker == false) {
            obj.IfWorkerWasFired();
        }
    }
}
