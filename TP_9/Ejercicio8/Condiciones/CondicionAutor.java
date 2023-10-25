package TP_9.Ejercicio8.Condiciones;

import TP_9.Ejercicio8.Video;

public class CondicionAutor implements Condicion{
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Video v) {
        return autor.equals(v.getUsuario().getNombreUsuario());
    }
}
