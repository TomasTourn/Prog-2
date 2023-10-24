package TP_9.Ejercicio6.Comparadores;

import TP_9.Ejercicio6.Elemento;

public class ComparadorAntiguedad extends ComparadorElemento{
    public ComparadorAntiguedad() {
    }

    public ComparadorAntiguedad(ComparadorElemento siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Elemento e1, Elemento e2) {
        return e1.getAntiguedad()-e2.getAntiguedad();
    }
}
