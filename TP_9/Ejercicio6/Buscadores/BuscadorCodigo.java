package TP_9.Ejercicio6.Buscadores;

import TP_9.Ejercicio6.Elemento;

public class BuscadorCodigo implements Buscador{
    private int codigo;

    public BuscadorCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getCodigo()==codigo;
    }
}
