package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionNot implements Condicion{
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Video v) {
        return !c.cumple(v);
    }
}
