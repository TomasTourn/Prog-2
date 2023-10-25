package TP_9.Ejercicio8.Comparadores;

import TP_9.Ejercicio8.Video;

public class CompararNombre extends Comparador{

    public CompararNombre() {
    }

    public CompararNombre(Comparador siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Video v1, Video v2) {
        return v1.getUsuario().getNombreUsuario().compareTo(v2.getUsuario().getNombreUsuario());
    }
}
