package TP_9.SistemaArchivos.Comparadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class ComparadorNegado extends ComparadorElemento {

    private ComparadorElemento comparador;

    public ComparadorNegado(ComparadorElemento comparador) {
        this.comparador = comparador;
    }

    public ComparadorNegado(ComparadorElemento siguiente, ComparadorElemento comparador) {
        super(siguiente);
        this.comparador = comparador;
    }

    @Override
    public int comparar(ElementoAbstracto e1, ElementoAbstracto e2) {
        return -1*comparador.comparar(e1,e2);
    }
}
