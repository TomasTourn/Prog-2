package TP_9.Ejercicio6.Calculadores;

import TP_9.Ejercicio6.ElementoDeprecated;

public class CalculadorRestaPorcentaje extends CalculadorValor{
    private double porcentaje;

    public CalculadorRestaPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(double valor) {
        double descuento= valor*porcentaje/100;
        return valor-descuento;
    }
}
