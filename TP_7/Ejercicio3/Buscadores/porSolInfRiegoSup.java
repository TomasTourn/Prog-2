package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class porSolInfRiegoSup extends Buscar {

    private int riego;
    private int sol;

    public porSolInfRiegoSup(int riego) {
        this.riego = riego;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()<sol && p.getRiego()>riego;
    }
}
