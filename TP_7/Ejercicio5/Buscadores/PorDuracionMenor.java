package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class PorDuracionMenor extends Buscar{

    private int duracion;

    public PorDuracionMenor(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDuracion()<duracion;
    }
}
