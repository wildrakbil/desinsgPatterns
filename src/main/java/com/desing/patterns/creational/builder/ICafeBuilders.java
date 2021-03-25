package com.desing.patterns.creational.builder;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public interface ICafeBuilders {

    interface IHielo {
        ICremaBatida hielo(String hielo);
    }

    interface ICremaBatida {
        IOpcionales cremaBatida(String cremaBatida);
    }

    interface IOpcionales {
        IOpcionales chocolate(String chocolate);
        IOpcionales canela(String canela);
        IOpcionales licor(String licor);
        IOpcionales extractoFruta(String extractoFruta);
        IOpcionales helado(String helado);
        IOpcionales pureCalabaza(String pureCalabaza);
        IOpcionales cremaCoco(String cremaCoco);
        Cafe build();
    }
}
