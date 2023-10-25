package TP_9.Ejercicio7.Condiciones;

import TP_9.Ejercicio7.ElementoBazar;

public class CondicionPrecioMenor implements Condicion{

    private double precio;

    public CondicionPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return precio<e.getPrecio();
    }
}
