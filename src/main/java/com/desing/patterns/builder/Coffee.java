package com.desing.patterns.builder;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class Coffee {

    private String chocolate;
    private String cremaBatida;
    private String canela;
    private String licor;
    private String extractoFruta;
    private String helado;
    private String pureCalabaza;
    private String cremaCoco;

    public static CoffeeBuilder CoffeeBuilder() {
        return new CoffeeBuilder();
    }

    public static class CoffeeBuilder {

        private Coffee Coffee;

        public CoffeeBuilder() {
            this.Coffee = new Coffee();
        }

        public Coffee build() {
            return this.Coffee;
        }

        public CoffeeBuilder chocolate(String chocolate) {
            this.Coffee.chocolate = chocolate;
            return this;
        }

        public CoffeeBuilder cremaBatida(String cremaBatida) {
            this.Coffee.cremaBatida = cremaBatida;
            return this;
        }

        public CoffeeBuilder canela(String canela) {
            this.Coffee.canela = canela;
            return this;
        }

        public CoffeeBuilder licor(String licor) {
            this.Coffee.licor = licor;
            return this;
        }

        public CoffeeBuilder extractoFruta(String extractoFruta) {
            this.Coffee.extractoFruta = extractoFruta;
            return this;
        }

        public CoffeeBuilder helado(String helado) {
            this.Coffee.helado = helado;
            return this;
        }

        public CoffeeBuilder pureCalabaza(String pureCalabaza) {
            this.Coffee.pureCalabaza = pureCalabaza;
            return this;
        }

        public CoffeeBuilder cremaCoco(String cremaCoco) {
            this.Coffee.cremaCoco = cremaCoco;
            return this;
        }
    }

    /**
     * Getter methods
     */

    public String getChocolate() {
        return chocolate;
    }

    public String getCremaBatida() {
        return cremaBatida;
    }

    public String getCanela() {
        return canela;
    }

    public String getLicor() {
        return licor;
    }

    public String getExtractoFruta() {
        return extractoFruta;
    }

    public String getHelado() {
        return helado;
    }

    public String getPureCalabaza() {
        return pureCalabaza;
    }

    public String getCremaCoco() {
        return cremaCoco;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Coffeee [");
        if (chocolate != null) {
            builder.append(chocolate);
            builder.append(", ");
        }
        if (cremaBatida != null) {
            builder.append(cremaBatida);
            builder.append(", ");
        }
        if (canela != null) {
            builder.append(canela);
            builder.append(", ");
        }
        if (licor != null) {
            builder.append(licor);
            builder.append(", ");
        }
        if (extractoFruta != null) {
            builder.append(extractoFruta);
            builder.append(", ");
        }
        if (helado != null) {
            builder.append(helado);
            builder.append(", ");
        }
        if (pureCalabaza != null) {
            builder.append(pureCalabaza);
            builder.append(", ");
        }
        if (cremaCoco != null) {
            builder.append(cremaCoco);
        }
        builder.append("]");
        return builder.toString();
    }
}
