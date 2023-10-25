package TP_9.Ejercicio8.Comparadores;

import TP_9.Ejercicio8.Video;

public class CompararMail extends Comparador{

    public CompararMail() {
    }
    public CompararMail(Comparador siguiente) {
        super(siguiente);
    }


    @Override
    public int comparar(Video v1, Video v2) {
        return v1.getUsuario().getMail().compareTo(v2.getUsuario().getMail());
    }
}
