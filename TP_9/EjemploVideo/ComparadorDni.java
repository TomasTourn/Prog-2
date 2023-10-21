package TP_9.EjemploVideo;

public class ComparadorDni extends ComparadorPersona{

    public ComparadorDni() {
    }

    public ComparadorDni(ComparadorPersona siguiente) {
        super(siguiente);
    }

    public int comparar(Persona p1,Persona p2){
        return p1.getDni()-p2.getDni();
    }

}
