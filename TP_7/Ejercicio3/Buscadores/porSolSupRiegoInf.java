package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class porSolSupRiegoInf extends Buscar {

    private int riego;
    private int sol;

    public porSolSupRiegoInf(int riego) {
        this.riego = riego;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()>sol && p.getRiego()<riego;
    }
}
