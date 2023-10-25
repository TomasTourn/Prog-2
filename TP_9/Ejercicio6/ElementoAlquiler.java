package TP_9.Ejercicio6;

import TP_9.Ejercicio6.Buscadores.Buscador;
import TP_9.Ejercicio6.Comparadores.ComparadorElemento;
import TP_9.Ejercicio8.Comparadores.Comparador;

import java.util.List;

public abstract class ElementoAlquiler {

    private int codigo;

    public ElementoAlquiler(int codigo) {
        this.codigo = codigo;
    }

    public abstract double cobrarAlquiler();
    public abstract List<Elemento>buscarElementos(Buscador b, ComparadorElemento c);
    public abstract double getValor();
    public abstract int getAntiguedad();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
