package TP_9.SistemaArchivos.Buscadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class BuscadorNot implements Buscador{

    private Buscador criterio;
    @Override
    public boolean cumple(ElementoAbstracto e) {
        return !criterio.cumple(e);
    }
}
