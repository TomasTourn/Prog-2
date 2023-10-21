package TP_9.SistemaArchivos.Comparadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

import java.util.Comparator;

public abstract class ComparadorElemento implements Comparator<ElementoAbstracto> {

    private ComparadorElemento siguiente;

    public ComparadorElemento(){
    }
    public ComparadorElemento(ComparadorElemento siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(ElementoAbstracto e1,ElementoAbstracto e2);
    public int compare(ElementoAbstracto e1, ElementoAbstracto e2){

        int res=this.comparar(e1,e2);

        if(res==0&&siguiente!=null){
            return siguiente.compare(e1,e2);
        }
        else return res;

    }


}
