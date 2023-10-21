package TP_9.SistemaArchivos.Buscadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class BuscadorCompuesto implements Buscador{

    private Buscador c1,c2;

    public BuscadorCompuesto(Buscador c1, Buscador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoAbstracto e) {
        return c1.cumple(e)&&c2.cumple(e);
    }
}
