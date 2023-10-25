package TP_9.Ejercicio8.Comparadores;

import TP_9.Ejercicio8.Video;

import java.util.Comparator;

public abstract class Comparador implements Comparator<Video> {

    private Comparador siguiente;

    public Comparador(){
    }

    public Comparador(Comparador siguiente) {
        this.siguiente = siguiente;
    }
    public abstract int comparar(Video v1,Video v2);
    public int compare(Video v1, Video v2){
        int res=comparar(v1,v2);
        if (res==0&& siguiente!=null)
                return siguiente.compare(v1,v2);
        else
            return res;
    }

    public Comparador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Comparador siguiente) {
        this.siguiente = siguiente;
    }
}
