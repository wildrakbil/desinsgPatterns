package com.desing.patterns.creational.objectPool;

/**
 * Created by AnDrEy on 4/9/2021.
 */
public class WorkSpace implements IWorkSpace{
    public void IfWorkerWasEmployed()
    {
        System.out.print("Worker work in shop");
    }

    public void IfWorkerWasFired()
    {
        System.out.print("The employee was released");
    }
}
