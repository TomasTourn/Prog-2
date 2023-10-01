package TP_7.Ejercicio4.Buscadores;

import TP_7.Ejercicio4.Ficha;

public class CombinacionAnd extends Buscar{

    private Buscar requisito1;
    private Buscar requisito2;

    public CombinacionAnd(Buscar requisito1, Buscar requisito2) {
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
    }

    @Override
    public boolean cumple(Ficha f) {
        return requisito1.cumple(f) && requisito2.cumple(f);
    }

}
