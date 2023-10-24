package TP_9.Ejercicio6.Calculadores;

import TP_9.Ejercicio6.Elemento;

public class CobradorCompuesto extends CobradorAlquiler{
    private CobradorAlquiler c1,c2;

    public CobradorCompuesto(CobradorAlquiler c1, CobradorAlquiler c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcularAlquiler(Elemento e) {
        return c1.calcularAlquiler(e)+c2.calcularAlquiler(e);
    }
}
