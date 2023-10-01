package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class PorTitulo extends Buscar{

    private String titulo;

    public PorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getTitulo().equalsIgnoreCase(titulo);
    }
}
