package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionPalabraClave implements Condicion{
    private String palabra;

    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Video v) {
        return v.contienePalabra(palabra);
    }
}
