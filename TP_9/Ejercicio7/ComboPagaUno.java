package TP_9.Ejercicio7;

import TP_9.Ejercicio7.Condiciones.Condicion;

public class ComboPagaUno extends ComboProductos{

    public ComboPagaUno(double descuentoIndividual, double descuentoMaximo, Condicion condicion) {
        super(descuentoIndividual, descuentoMaximo, condicion);
    }

    @Override
    public double getPrecio() {
        double precioMaximo=0;
        for (ElementoBazar e:getElementos()) {
                if (e.getPrecio()>precioMaximo)
                    precioMaximo=e.getPrecio();
        }
        return precioMaximo;
    }
}
