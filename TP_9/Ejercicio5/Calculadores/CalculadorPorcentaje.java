package TP_9.Ejercicio5.Calculadores;

import TP_9.Ejercicio5.ElementoA;

public class CalculadorPorcentaje extends CalculadorCosto{

    public double porcentaje;

    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(ElementoA e) {
        return porcentaje * e.getMontoAsegurado()/100;
    }
}
