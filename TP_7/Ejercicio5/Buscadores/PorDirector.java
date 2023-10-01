package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class PorDirector extends Buscar {

    private String director;

    public PorDirector(String director) {
        director = director.toLowerCase();
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDirector().equals(director);
    }
}
