package Parciales.ParcialEgresados.Condiciones;

import Parciales.ParcialEgresados.ElementoViaje;

public class CondicionNot implements Condicion{
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(ElementoViaje e) {
        return !c.cumple(e);
    }
}
