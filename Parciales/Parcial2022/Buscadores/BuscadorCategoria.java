package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorCategoria implements Buscador{

    private String categoria;

    public BuscadorCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getCategoria().equals(categoria);
    }
}
