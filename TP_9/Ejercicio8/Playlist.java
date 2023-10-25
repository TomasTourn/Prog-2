package TP_9.Ejercicio8;

import TP_9.Ejercicio8.Comparadores.Comparador;
import TP_9.Ejercicio8.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist extends ElementoVideo{
    private List<ElementoVideo>elementos;
    private int demora;

    public Playlist(String titulo, int demora) {
        super(titulo);
        this.demora = demora;
        this.elementos=new ArrayList<>();
    }

    public void addElemento(ElementoVideo e){
        if (e!=null && !elementos.contains(e)){
                elementos.add(e);
        }
    }

    @Override
    public List<Video> buscarVideos(Condicion c, Comparador comp) {
        List<Video>videos=new ArrayList<>();
        for (ElementoVideo e:elementos) {
                elementos.addAll(e.buscarVideos(c,comp));
        }
        Collections.sort(videos,comp);
        return videos;
    }

    @Override
    public List<String> getPalabrasClave() {
        List<String>palabras=new ArrayList<>();

        for (ElementoVideo e:elementos) {
            for (String p:e.getPalabrasClave()) {
                    if (!palabras.contains(p))
                        palabras.add(p);
            }
        }
        return palabras;
    }

    @Override
    public int cantVideos() {
        int cant=0;
        for (ElementoVideo e:elementos) {
                cant+=e.cantVideos();
        }
        return cant;
    }

    @Override
    public int getDuracion() {
        int duracion=0;

        for (ElementoVideo e:elementos) {
                duracion+=e.getDuracion();
        }
        return duracion+demora;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }
}
