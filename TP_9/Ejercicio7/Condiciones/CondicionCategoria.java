package TP_9.Ejercicio7.Condiciones;

import TP_9.Ejercicio7.ElementoBazar;

public class CondicionCategoria implements Condicion{
    private String categoria;

    public CondicionCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return e.poseeCategoria(categoria);
    }
}
