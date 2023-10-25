package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionOr implements Condicion{
    private Condicion c1,c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Video v) {
        return c1.cumple(v)||c2.cumple(v);
    }
}
