package TP_9.Ejercicio6.Comparadores;

import TP_9.Ejercicio6.Elemento;

import java.util.Comparator;

public abstract class ComparadorElemento implements Comparator<Elemento> {

    private ComparadorElemento siguiente;

    public ComparadorElemento(){
    }
    public ComparadorElemento(ComparadorElemento siguiente) {
        this.siguiente = siguiente;
    }
    public abstract int comparar(Elemento e1,Elemento e2);

    public int compare(Elemento e1,Elemento e2){
        int res=comparar(e1,e2);
            if (res==0&&siguiente!=null)
                  return siguiente.compare(e1,e2);
            else
                return res;
    }
}
