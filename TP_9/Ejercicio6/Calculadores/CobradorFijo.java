package TP_9.Ejercicio6.Calculadores;

import TP_9.Ejercicio6.Elemento;

public class CobradorFijo extends CobradorAlquiler{
    private double montoFijo;

    public CobradorFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularAlquiler(Elemento e) {
        return montoFijo;
    }
}
