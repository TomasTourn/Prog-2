package TP_9.Ejercicio8;

import TP_9.Ejercicio8.Comparadores.Comparador;
import TP_9.Ejercicio8.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Video extends ElementoVideo{

    private Usuario usuario;
    private int duracion;
    private int visualizaciones;
    private int meGusta;
    private int noMeGusta;
    private int anioPublicacion;
    private List<String>palabrasClave;


    public Video(String titulo, Usuario usuario, int duracion, int visualizaciones, int meGusta, int noMeGusta, int anioPublicacion) {
        super(titulo);
        this.usuario = usuario;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.meGusta = meGusta;
        this.noMeGusta = noMeGusta;
        this.anioPublicacion = anioPublicacion;
        this.palabrasClave=new ArrayList<>();
    }

    @Override
    public int cantVideos() {
        return 1;
    }

    @Override
    public List<Video> buscarVideos(Condicion c, Comparador comp) {
        List<Video>video=new ArrayList<>();
            if (c.cumple(this))
                video.add(this);
            return video;
    }

    public boolean contienePalabra(String p){
        return palabrasClave.contains(p);
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getNoMeGusta() {
        return noMeGusta;
    }

    public void setNoMeGusta(int noMeGusta) {
        this.noMeGusta = noMeGusta;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public List<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }


}
