package com.desing.patterns.creational.singleton;

import java.util.Date;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class Reloj extends Thread {

    private Date hora;

    public Reloj() {
        this.start();
    }

    public Date getHora() {
        return hora;
    }

    @Override
    public void run() {
        int count = 0;
        while (true && count < 2) {
            hora = new Date(System.currentTimeMillis());
            System.out.println("No singleton-> " + hora);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
