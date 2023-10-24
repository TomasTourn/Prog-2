package TP_9.Ejercicio6.Comparadores;

import TP_9.Ejercicio6.Elemento;

public class ComparadorCodigo extends ComparadorElemento{

    public ComparadorCodigo() {
    }

    public ComparadorCodigo(ComparadorElemento siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Elemento e1, Elemento e2) {
           return e1.getCodigo()-e2.getCodigo();
    }
}
