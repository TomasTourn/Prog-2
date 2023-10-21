package TP_9.SistemaArchivos.Buscadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

public class BuscadorNombreContiene implements Buscador{

    private String nombre;

    public BuscadorNombreContiene(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoAbstracto e) {
        return e.getNombre().contains(nombre);
    }
}
