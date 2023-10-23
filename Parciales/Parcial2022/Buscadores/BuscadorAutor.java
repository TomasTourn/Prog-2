package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorAutor implements Buscador{

    private String autor;

    public BuscadorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equalsIgnoreCase(autor);
    }
}
