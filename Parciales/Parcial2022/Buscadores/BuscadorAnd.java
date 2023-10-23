package Parciales.Parcial2022.Buscadores;

import Parciales.Parcial2022.Noticia;

public class BuscadorAnd implements Buscador{

    private Buscador c1,c2;

    public BuscadorAnd(Buscador c1, Buscador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return c1.cumple(n)&&c2.cumple(n);
    }
}
