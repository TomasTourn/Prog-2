package Parciales.ParcialEgresados.Condiciones;

import Parciales.ParcialEgresados.ElementoViaje;

public class CondicionDebeMasPorcentaje implements Condicion{

   private double porcentaje;

    public CondicionDebeMasPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public boolean cumple(ElementoViaje e) {
        //si la deuda es mayor al precio por el porcentaje q me pasaron cumple
        return e.getDeuda() > e.getPrecio() * porcentaje;
    }
}
