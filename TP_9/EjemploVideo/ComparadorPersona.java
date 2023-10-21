package TP_9.EjemploVideo;

import java.util.Comparator;

public abstract class ComparadorPersona implements Comparator<Persona> {

    private ComparadorPersona siguiente;
    public ComparadorPersona(){
        siguiente=null;
    }

    public ComparadorPersona(ComparadorPersona siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar (Persona p1,Persona p2);
    public int compare(Persona p1,Persona p2){
        int res;
        res=this.comparar(p1,p2);
        if(res==0){
            if(siguiente!=null)
               return siguiente.compare(p1,p2);
            else return res;
        }
            return res;
    }

}
