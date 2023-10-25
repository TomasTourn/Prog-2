package Parciales.ParcialEgresados.Condiciones;

import Parciales.ParcialEgresados.ElementoViaje;

public class CondicionDeuda implements Condicion{
    private double deuda;

    public CondicionDeuda(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public boolean cumple(ElementoViaje e) {
        return e.getDeuda()==deuda;
    }
}
