package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

import java.util.List;

public class PorNombreVulgar extends Buscar {
    public PorNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    private String nombreVulgar;
    @Override
    public boolean cumple(Planta p){
     return p.getNombresVulgares().contains(nombreVulgar);
    }

}
