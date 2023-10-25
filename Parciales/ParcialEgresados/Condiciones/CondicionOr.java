package Parciales.ParcialEgresados.Condiciones;

import Parciales.ParcialEgresados.ElementoViaje;

public class CondicionOr implements Condicion{
    private Condicion c1,c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoViaje e) {
        return c1.cumple(e)||c2.cumple(e);
    }
}
