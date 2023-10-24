package TP_9.Ejercicio5.Calculadores;

import TP_9.Ejercicio5.ElementoA;

public class CalculadorMontoFijo extends CalculadorCosto{
    private double monto;

    public CalculadorMontoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcular(ElementoA e) {
        return monto;
    }
}
