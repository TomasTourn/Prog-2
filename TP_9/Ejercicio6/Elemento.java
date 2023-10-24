package TP_9.Ejercicio6;

import TP_9.Ejercicio6.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public class Elemento extends ElementoAlquiler{

    private int mesesAntiguedad;
    private double valor;
    private String descripcion;

    public Elemento(int codigo, int mesesAntiguedad, double valor, String descripcion) {
        super(codigo);
        this.mesesAntiguedad = mesesAntiguedad;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    @Override
    public List<Elemento> buscarElementos(Buscador b) {
        List<Elemento>elemento=new ArrayList<>();
            if (b.cumple(this))
                elemento.add(this);
            return elemento;
    }

    public int getAntiguedad() {
        return mesesAntiguedad;
    }

    public void setAntiguedad(int mesesAntiguedad) {
        this.mesesAntiguedad = mesesAntiguedad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
