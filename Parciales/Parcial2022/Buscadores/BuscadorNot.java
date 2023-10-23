package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorNot implements Buscador{

    private Buscador criterio;

    public BuscadorNot(Buscador criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Noticia n) {
        return !criterio.cumple(n);
    }
}
