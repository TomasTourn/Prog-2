package TP_9.EjemploVideo;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Persona> {

    private Comparator<Persona>criterio1,criterio2;

    public ComparadorCompuesto(Comparator<Persona> criterio1, Comparator<Persona> criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    public int  compare(Persona p1,Persona p2){
        int res=criterio1.compare(p1,p2);
        if(res!=0){
            return res;
        }
        else return criterio2.compare(p1,p2);
    }

}
