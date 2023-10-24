package TP_9.Ejercicio5.Comparadores;

import TP_9.Ejercicio5.Seguro;

public class ComparadorPoliza extends ComparadorSeguro{

    @Override
    public int comparar(Seguro s1, Seguro s2) {
        return s1.getPoliza()-s2.getPoliza();
    }
}
