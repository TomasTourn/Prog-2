package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorNot implements Buscador{
    private Buscador b;

    public BuscadorNot(Buscador b) {
        this.b = b;
    }

    @Override
    public boolean cumple(Elemento e) {
        return !b.cumple(e);
    }
}
