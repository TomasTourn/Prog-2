package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class porEstaEnNombreCientifico extends Buscar {

    private String nombreCientifico;

    public porEstaEnNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public boolean cumple(Planta p){
        return p.getNombreCientifico().contains(nombreCientifico);
    }

}
