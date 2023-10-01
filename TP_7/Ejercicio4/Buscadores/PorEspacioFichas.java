package TP_7.Ejercicio4.Buscadores;

import TP_7.Ejercicio4.Ficha;

public class PorEspacioFichas extends Buscar{

    private int espacio;

    public PorEspacioFichas(int espacio){
        this.espacio=espacio;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacio()>espacio;
    }
}
