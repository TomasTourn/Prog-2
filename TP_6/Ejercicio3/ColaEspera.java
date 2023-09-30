package TP_6.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class ColaEspera {

    protected List<Object> elementos;

    public ColaEspera(){
        this.elementos=new ArrayList<>();
    }


    public void addElemento(Object elemento) {

        int i = 0;

        while (i < elementos.size() && this.comparar(this.elementos.get(i), elemento)) {

            i++;
        }
        if (i < this.elementos.size()) {
            this.elementos.add(i, elemento);
        } else {
            this.elementos.add(elemento);
        }
    }

    public boolean hayElementos(){
        return !elementos.isEmpty();
    }
    public Object getPrimera(){
        if(hayElementos())
        return elementos.get(0);
        else
            return null;

    }

    public void borrarPrimera(){
        if(hayElementos())
            elementos.remove(0);
    }
    public abstract boolean comparar(Object e1,Object e2);




}
