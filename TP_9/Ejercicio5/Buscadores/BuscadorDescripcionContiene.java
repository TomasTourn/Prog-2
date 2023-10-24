package TP_9.Ejercicio5.Buscadores;

import TP_9.Ejercicio5.ElementoA;
import TP_9.Ejercicio5.Seguro;

public class BuscadorDescripcionContiene implements Buscador{
    private String palabra;

    public BuscadorDescripcionContiene(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDescripcion().contains(palabra);
    }
}
