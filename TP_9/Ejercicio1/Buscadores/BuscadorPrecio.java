package TP_9.Ejercicio1.Buscadores;

import TP_9.Ejercicio1.Socio;

public class BuscadorPrecio implements Buscador{

    private double precio;

    public BuscadorPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public boolean cumple(Socio s) {
        return s.pagoMasDe(precio);
    }
}
