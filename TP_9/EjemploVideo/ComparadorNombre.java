package TP_9.EjemploVideo;

import java.util.Comparator;

public class ComparadorNombre extends ComparadorPersona {

    public ComparadorNombre() {
    }

    public ComparadorNombre(ComparadorPersona siguiente) {
        super(siguiente);
    }


    public int comparar(Persona p1,Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }


}
