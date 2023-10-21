package TP_9.Ejercicio1;

import java.util.Comparator;

public abstract class ComparadorSocio implements Comparator<Socio> {

    private ComparadorSocio siguiente;

    public ComparadorSocio(){
        siguiente=null;
    }
    public ComparadorSocio(ComparadorSocio siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(Socio s1, Socio s2);

    public int compare(Socio s1,Socio s2){

        int res=this.comparar(s1,s2);

        if(res==0 && siguiente!=null){
            return siguiente.compare(s1,s2);
        }
        else return res;
    }


}
