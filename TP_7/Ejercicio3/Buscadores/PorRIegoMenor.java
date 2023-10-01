package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class PorRIegoMenor extends Buscar {

    private int riego;

    public PorRIegoMenor(int riego) {
        this.riego = riego;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRiego()<riego;
    }
}
