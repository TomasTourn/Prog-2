package TP_9.Ejercicio5.Comparadores;

import TP_9.Ejercicio5.Seguro;

import java.util.Comparator;

public abstract class ComparadorSeguro implements Comparator<Seguro> {

    private ComparadorSeguro siguiente;

    public ComparadorSeguro(){
    }
    public ComparadorSeguro(ComparadorSeguro siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(Seguro s1,Seguro s2);

    public int compare(Seguro s1,Seguro s2){
        int res=comparar(s1,s2);
            if (res==0&&siguiente!=null){
                return siguiente.comparar(s1,s2);
            }
            else
                return res;
    }



    public ComparadorSeguro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ComparadorSeguro siguiente) {
        this.siguiente = siguiente;
    }
}
