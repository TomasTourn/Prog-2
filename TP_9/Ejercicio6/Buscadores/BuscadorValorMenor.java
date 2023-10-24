package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorValorMenor implements Buscador{
    private double valor;

    public BuscadorValorMenor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getValor()>valor;
    }
}
