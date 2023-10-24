package TP_9.Ejercicio6;

import TP_9.Ejercicio6.Buscadores.Buscador;

import java.util.List;

public abstract class ElementoAlquiler {

    private int codigo;

    public ElementoAlquiler(int codigo) {
        this.codigo = codigo;
    }

    public abstract double cobrarAlquiler();
    public abstract List<Elemento>buscarElementos(Buscador b);
    public abstract double getValor();
    public abstract int getAntiguedad();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
