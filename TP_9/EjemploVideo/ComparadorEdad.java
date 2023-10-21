package TP_9.EjemploVideo;

import java.util.Comparator;

public class ComparadorEdad extends ComparadorPersona {

    public ComparadorEdad() {
    }

    public ComparadorEdad(ComparadorPersona siguiente) {
        super(siguiente);
    }

    public int comparar(Persona p1, Persona p2){
        return p1.getEdad()-p2.getEdad();
    }


}
