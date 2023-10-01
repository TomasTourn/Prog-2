package TP_7.Ejercicio4.Buscadores;

import TP_7.Ejercicio4.Ficha;

public class PorDestruccionMayorA extends Buscar{

    private int poderDestruccion;

    public PorDestruccionMayorA(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean cumple(Ficha f) {
       return f.getPoderDestruccion()>poderDestruccion;
    }
}
