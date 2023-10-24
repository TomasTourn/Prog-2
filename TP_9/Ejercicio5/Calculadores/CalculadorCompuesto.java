package TP_9.Ejercicio5.Calculadores;

import TP_9.Ejercicio5.ElementoA;

public class CalculadorCompuesto extends CalculadorCosto{

    private CalculadorCosto c1,c2;

    public CalculadorCompuesto(CalculadorCosto c1, CalculadorCosto c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(ElementoA e) {
        return c1.calcular(e)+c2.calcular(e);
    }
}
