package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorTituloContiene implements Buscador{

    private String titulo;

    public BuscadorTituloContiene(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(titulo);
    }
}
