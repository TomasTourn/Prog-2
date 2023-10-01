package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class PorClasificacion extends Buscar {

    private String clasificacion;

    public PorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacionSuperior().equals(clasificacion);
    }
}
