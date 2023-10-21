package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorNegado implements Buscador{

    private Buscador b;

    public BuscadorNegado(Buscador b) {
        this.b = b;
    }

    @Override
    public boolean cumple(Socio s) {
        return !b.cumple(s);
    }
}
