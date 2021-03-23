package com.desing.patterns.builder;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class Cafe {

    private String hielo;
    private String chocolate;
    private String cremaBatida;
    private String canela;
    private String licor;
    private String extractoFruta;
    private String helado;
    private String pureCalabaza;
    private String cremaCoco;

    public static class CafeBuilder implements ICafeBuilders.IHielo, ICafeBuilders.ICremaBatida, ICafeBuilders.IOpcionales{

        private Cafe cafe;

        public CafeBuilder() {
            this.cafe = new Cafe();
        }

        public Cafe build() {
            return this.cafe;
        }

        public ICafeBuilders.ICremaBatida hielo(String hielo){
            this.cafe.hielo = hielo;
            return this;
        }

        public ICafeBuilders.IOpcionales cremaBatida(String cremaBatida){
            this.cafe.cremaBatida = cremaBatida;
            return this;
        }

        public ICafeBuilders.IOpcionales chocolate(String chocolate) {
            this.cafe.chocolate = chocolate;
            return this;
        }

        public ICafeBuilders.IOpcionales canela(String canela) {
            this.cafe.canela = canela;
            return this;
        }


        public ICafeBuilders.IOpcionales licor(String licor) {
            this.cafe.licor = licor;
            return this;
        }

        public ICafeBuilders.IOpcionales extractoFruta(String extractoFruta) {
            this.cafe.extractoFruta = extractoFruta;
            return this;
        }


        public ICafeBuilders.IOpcionales helado(String helado) {
            this.cafe.helado = helado;
            return this;
        }

        public ICafeBuilders.IOpcionales pureCalabaza(String pureCalabaza) {
            this.cafe.pureCalabaza = pureCalabaza;
            return this;
        }

        public ICafeBuilders.IOpcionales cremaCoco(String cremaCoco) {
            this.cafe.cremaCoco = cremaCoco;
            return this;
        }
    }


    public static ICafeBuilders.IHielo cafeBuilder(){
        return new CafeBuilder();
    }

    public String getHielo() {
        return hielo;
    }

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
        StringBuilder builder2 = new StringBuilder();
        builder2.append("Cafe [");
        if (hielo != null) {
            builder2.append(hielo);
            builder2.append(", ");
        }
        if (chocolate != null) {
            builder2.append(chocolate);
            builder2.append(", ");
        }
        if (cremaBatida != null) {
            builder2.append(cremaBatida);
            builder2.append(", ");
        }
        if (canela != null) {
            builder2.append(canela);
            builder2.append(", ");
        }
        if (licor != null) {
            builder2.append(licor);
            builder2.append(", ");
        }
        if (extractoFruta != null) {
            builder2.append(extractoFruta);
            builder2.append(", ");
        }
        if (helado != null) {
            builder2.append(helado);
            builder2.append(", ");
        }
        if (pureCalabaza != null) {
            builder2.append(pureCalabaza);
            builder2.append(", ");
        }
        if (cremaCoco != null) {
            builder2.append(cremaCoco);
        }
        builder2.append("]");
        return builder2.toString();
    }
}
