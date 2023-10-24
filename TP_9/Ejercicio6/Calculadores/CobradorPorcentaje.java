package TP_9.Ejercicio6.Calculadores;

import TP_9.Ejercicio6.Elemento;

public class CobradorPorcentaje extends CobradorAlquiler{

    private double porcentaje;

    public CobradorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularAlquiler(Elemento e) {
        return (porcentaje*e.getValor())/100;
    }
}
