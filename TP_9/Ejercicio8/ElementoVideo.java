package TP_9.Ejercicio8;

import TP_9.Ejercicio8.Comparadores.Comparador;
import TP_9.Ejercicio8.Condiciones.Condicion;

import java.util.List;

public abstract class ElementoVideo {

    private String titulo;


    public boolean equals(ElementoVideo e){
        try {
            return e.getTitulo().equals(titulo);
        }
        catch (Exception exc){
            return false;
        }
    }
    public abstract List<Video>buscarVideos(Condicion c, Comparador comp);
    public abstract List<String>getPalabrasClave();
    public abstract int cantVideos();
    public abstract int getDuracion();
    public ElementoVideo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
