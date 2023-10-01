package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class CombinacionAnd extends Buscar{// todo lo comun deberia heredar pero ya tiene herencia, tal vez usar interfaces para no repetir tanto codigo?
    private Buscar requisito1;
    private Buscar requisito2;

    public CombinacionAnd(Buscar requisito1, Buscar requisito2) {
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return requisito1.cumple(p) && requisito2.cumple(p);
    }
}
