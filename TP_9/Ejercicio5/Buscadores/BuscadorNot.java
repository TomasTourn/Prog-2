package TP_9.Ejercicio5.Buscadores;

import TP_9.Ejercicio5.Seguro;

public class BuscadorNot implements Buscador{

    private Buscador b;

    public BuscadorNot(Buscador b) {
        this.b = b;
    }

    @Override
    public boolean cumple(Seguro s) {
        return !b.cumple(s);
    }
}
