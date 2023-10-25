package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionAnio implements Condicion{

    private int anio;

    public CondicionAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getAnioPublicacion()==anio;
    }
}
