package TP_9.SistemaArchivos.Buscadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class BuscadorNombre implements Buscador{

    private String nombre;

    public BuscadorNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoAbstracto e) {
        return e.getNombre().equals(nombre);
    }
}
