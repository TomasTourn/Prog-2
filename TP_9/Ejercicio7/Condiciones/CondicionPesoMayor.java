package TP_9.Ejercicio7.Condiciones;

import TP_9.Ejercicio7.ElementoBazar;

public class CondicionPesoMayor implements Condicion{
    private double peso;

    public CondicionPesoMayor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return peso>e.getPeso();
    }
}
