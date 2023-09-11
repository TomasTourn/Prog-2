package TP_6.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ColaEspera {

    private List<Elemento>elementos;

    public ColaEspera(){
        elementos=new ArrayList<>();
    }

    public void agregarElemento(Elemento e){

       int i=0;

       while (!elementos.contains(e) && i<elementos.size()){//recorro los elementos

           if(e.esMayor(elementos.get(i))){//busco hasta encontrar uno al que sea mayor y agrego
               elementos.add(i,e);
           }

           i++;
       }
       if(!elementos.contains(e))
        elementos.add(e);//sino, agrego al final

    }

    public Elemento getSiguiente(){

        if(!elementos.isEmpty())
        return elementos.remove(0);//elimina el primero
        else
            return null;
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }
    public List<Elemento> getElementos() {
        return new ArrayList<>(elementos);//devuelve copia
    }
}
