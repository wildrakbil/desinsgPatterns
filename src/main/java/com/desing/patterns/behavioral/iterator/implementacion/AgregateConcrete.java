package com.desing.patterns.behavioral.iterator.implementacion;

import java.util.Vector;

import com.desing.patterns.behavioral.iterator.interfaces.Aggregate;
import com.desing.patterns.behavioral.iterator.interfaces.MyIterator;

public class AgregateConcrete implements Aggregate{

    protected Vector aDatos = new Vector();
    // -------------------------
    public AgregateConcrete() {
        this.llenar();
    }

    @Override
    public MyIterator getIterador() {
        return new IteratorConcrete( this );
    }
    
    public void llenar()
    {
        this.aDatos.add( new String("JOSE") );
        this.aDatos.add( new String("MARTA") );
        this.aDatos.add( new String("ANTONIO") );
        this.aDatos.add( new String("ROMINA") );
    }

}
