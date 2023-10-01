package TP_7.Ejercicio4.Buscadores;

import TP_7.Ejercicio4.Ficha;

public class PorFortalezaMayorA extends  Buscar{

    private int fortaleza;

    public PorFortalezaMayorA(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza()>fortaleza;
    }
}
