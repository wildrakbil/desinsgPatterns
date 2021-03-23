package com.desing.patterns.singleton;

import java.util.Date;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class RelojSingleton extends Thread {

    private static RelojSingleton relojSingleton;

    private Date hora;

    private RelojSingleton() {
    }

    private synchronized static void createIntance() {
        if (relojSingleton == null) {
            relojSingleton = new RelojSingleton();
            relojSingleton.start();
        }
    }

    public static RelojSingleton getInstancia() {
        createIntance();
        return relojSingleton;
    }

    public Date getHora() {
        return hora;
    }

    @Override
    public void run() {
        int count = 0;
        while (true && count < 2) {
            hora = new Date(System.currentTimeMillis());
            System.out.println("singleton   -> " + hora);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
