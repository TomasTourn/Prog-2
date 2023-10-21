package TP_9.SistemaArchivos.Comparadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class ComparadorNombre extends ComparadorElemento{

    public ComparadorNombre() {
    }

    public ComparadorNombre(ComparadorElemento siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(ElementoAbstracto e1, ElementoAbstracto e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
