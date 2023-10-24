package TP_9.Ejercicio5.Buscadores;

import TP_9.Ejercicio5.Seguro;

public class BuscadorDNI implements Buscador{
    private int dni;

    public BuscadorDNI(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDni()==dni;
    }
}
