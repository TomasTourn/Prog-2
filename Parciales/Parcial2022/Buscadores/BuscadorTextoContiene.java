package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorTextoContiene implements Buscador{

    private String frase;

    public BuscadorTextoContiene(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().contains(frase);
    }
}
