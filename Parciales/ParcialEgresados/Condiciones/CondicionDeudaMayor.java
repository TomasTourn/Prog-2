package Parciales.ParcialEgresados.Condiciones;

import Parciales.ParcialEgresados.ElementoViaje;

public class CondicionDeudaMayor implements Condicion{
    private double deuda;

    public CondicionDeudaMayor(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public boolean cumple(ElementoViaje e) {
        return e.getDeuda()<deuda;
    }
}
