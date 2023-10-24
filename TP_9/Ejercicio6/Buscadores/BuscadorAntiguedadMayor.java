package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorAntiguedadMayor implements Buscador{
    private int mesesAntiguedad;

    public BuscadorAntiguedadMayor(int mesesAntiguedad) {
        this.mesesAntiguedad = mesesAntiguedad;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getAntiguedad()<mesesAntiguedad;
    }

}
