package TP_9.Ejercicio5.Comparadores;

import TP_9.Ejercicio5.Seguro;

public class ComparadorDni extends ComparadorSeguro {

    @Override
    public int comparar(Seguro s1, Seguro s2) {
        return s1.getDni()-s2.getDni();
    }
}
