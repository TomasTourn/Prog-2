package TP_9.Ejercicio5;

import TP_9.Ejercicio5.Buscadores.Buscador;
import TP_9.Ejercicio5.Calculadores.CalculadorCosto;

import java.util.List;

public abstract class ElementoA {

    private int dni;

    public ElementoA(int dni) {
        this.dni = dni;
    }

    public abstract List<ElementoA>buscarSeguros(Buscador b);
    public abstract int getPoliza();
    public abstract double getMontoAsegurado();

    public abstract double calcularCostoPoliza();

    public String toString(){
        return "\n«Dni: "+dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
