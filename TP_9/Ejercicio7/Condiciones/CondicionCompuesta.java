package TP_9.Ejercicio7.Condiciones;

import TP_9.Ejercicio7.ElementoBazar;
import TP_9.Ejercicio7.Producto;

public class CondicionCompuesta implements Condicion{
    private Condicion c1,c2;

    public CondicionCompuesta(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return c1.cumple(e)&&c2.cumple(e);
    }
}
