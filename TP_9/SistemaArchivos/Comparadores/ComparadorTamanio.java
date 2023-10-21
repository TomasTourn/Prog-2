package TP_9.SistemaArchivos.Comparadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class ComparadorTamanio extends ComparadorElemento{

    public ComparadorTamanio() {
    }

    public ComparadorTamanio(ComparadorElemento siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(ElementoAbstracto e1, ElementoAbstracto e2) {

        return Double.compare(e1.getTamanio(), e2.getTamanio());//metodo para comparar double

        /* igual a esto
        *    if(e1.getTamanio()>e2.getTamanio()){
            return 1;
        } else if (e1.getTamanio()<e2.getTamanio()) {
            return -1;
        }
        else
            return 0;
    }*/
    }
}
