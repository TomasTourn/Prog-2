package TP_7.Ejercicio2.Busquedas;

import TP_7.Ejercicio2.Buscar;
import TP_7.Ejercicio2.Documento;

public class BuscarPorCombinacionOr extends Buscar {

    private Buscar requisito1;
    private Buscar requisito2;
    @Override
    public boolean cumple(Documento d) {
        return (requisito1.cumple(d)|| requisito2.cumple(d));
    }
}
