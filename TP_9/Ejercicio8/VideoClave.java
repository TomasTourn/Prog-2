package TP_9.Ejercicio8;

public class VideoClave extends Video{
    public VideoClave(String titulo, Usuario usuario, int duracion, int visualizaciones, int meGusta, int noMeGusta, int anioPublicacion) {
        super(titulo, usuario, duracion, visualizaciones, meGusta, noMeGusta, anioPublicacion);
    }

    @Override
    public boolean contienePalabra(String p) {
        return true;
    }
}
