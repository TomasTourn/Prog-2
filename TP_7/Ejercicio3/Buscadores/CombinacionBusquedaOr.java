package TP_7.Ejercicio3.Buscadores;

import TP_7.Ejercicio3.Buscar;
import TP_7.Ejercicio3.Planta;

public class CombinacionBusquedaOr extends Buscar {

    private Buscar requisito1;
    private Buscar requisito2;

    public CombinacionBusquedaOr(Buscar requisito1, Buscar requisito2) {
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
    }

    @Override
    public boolean cumple(Planta p) {
        return requisito1.cumple(p)|| requisito2.cumple(p);
    }
}
