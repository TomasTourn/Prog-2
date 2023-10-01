package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class PorGenero extends Buscar{

    private String genero;

    public PorGenero(String genero) {
        this.genero = genero.toLowerCase();
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getGeneros().contains(genero);
    }
}
