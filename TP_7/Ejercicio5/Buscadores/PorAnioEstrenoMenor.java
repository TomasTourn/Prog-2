package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class PorAnioEstrenoMenor extends Buscar{

    private int anioEstreno;

    public PorAnioEstrenoMenor(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno()<anioEstreno;
    }
}
