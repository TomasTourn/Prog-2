package TP_9.Ejercicio5.Buscadores;

import TP_9.Ejercicio5.Seguro;

public class BuscadorOR implements Buscador{

    private Buscador b1,b2;

    public BuscadorOR(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Seguro s) {

        return b1.cumple(s)||b2.cumple(s);
    }

}
