package com.desing.exercise.medidorDeSensores;
import java.util.ArrayList;
/**
 * Created by AnDrEy on 3/13/2021.
 */
public class MedidorSensores implements ISujeto {
    // Atributos que modelan el estado
    private double temperatura;
    private double spo2;
    // Listado de observers
    ArrayList<Object> suscriptores;
    public double getTemperatura() {
        return this.temperatura;
    }
    // Cada vez que se modifique el estado, se invocara el metodo
    // NotificarObservador()
    public void setTemperatura(double valor) {
        if (this.temperatura != valor) {
            this.temperatura = valor;
            NotificarObservadores();
        }
    }
    public double getSPO2() {
        return this.spo2;
    }
    // Cada vez que se modifique el estado, se invocara el metodo
    // NotificarObservador()
    public void setSPO2(double valor) {
        if (this.spo2 != valor) {
            this.spo2 = valor;
            NotificarObservadores();
        }
    }
    // Constructor que creara un medidor con los valores iniciales
    public MedidorSensores(double temperatura, double spo2) {
        this.suscriptores = new ArrayList<Object>();
        this.temperatura = temperatura;
        this.spo2 = spo2;
    }
    // Comprobamos si el observer se encuentra en la lista. En caso contrario,
    // lo incluye en la lista
    public void RegistrarObservador(IObservador o) {
        if (!suscriptores.contains(o))
            suscriptores.add(o);
    }
    // Comprobamos si el observer se encuentra en la lista. En caso afirmativo,
    // lo elimina de la lista
    public void EliminarObservador(IObservador o) {
        if (suscriptores.contains(o))
            suscriptores.remove(o);
    }
    // Recorre la lista de observers e invoca su metodo Update()
    public void NotificarObservadores() {
        // Creamos un array con el estado del Sujeto
        double[] valores = { this.temperatura, this.spo2 };
        // Recorremos todos los objetos suscritos (observers)
        IObservador observador;
        for (Object o : suscriptores) {
            // Invocamos el metodo Update de cada observador, pasandole el array
            // con el estado del Sujeto como parametro.
            // Cada observador ya hara lo que estime necesario con esa
            // informacion.
            observador = (IObservador) o;
            observador.update(valores);
        }
    }

}
