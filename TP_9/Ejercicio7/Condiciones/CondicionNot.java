package TP_9.Ejercicio7.Condiciones;

import TP_9.Ejercicio7.ElementoBazar;
import TP_9.Ejercicio7.Producto;

public class CondicionNot implements Condicion{
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return !c.cumple(e);
    }
}
