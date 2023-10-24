package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorDescripcionContiene implements Buscador{
    private String palabra;

    public BuscadorDescripcionContiene(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Elemento e) {
        return  e.getDescripcion().contains(palabra);
    }
}
