package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorOr implements Buscador{
    private Buscador b1,b2;

    public BuscadorOr(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Elemento e) {
        return b1.cumple(e)||b2.cumple(e);
    }
}
