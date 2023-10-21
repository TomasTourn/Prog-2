package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorAnd implements Buscador{

    private Buscador b1;
    private Buscador b2;

    public BuscadorAnd(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Socio s1) {
        return b1.cumple(s1)&&b2.cumple(s1);
    }
}
