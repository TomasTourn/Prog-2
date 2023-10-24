package TP_9.Ejercicio5;

import TP_9.Ejercicio5.Buscadores.Buscador;
import TP_9.Ejercicio5.Calculadores.CalculadorCosto;

import java.util.ArrayList;
import java.util.List;

public class Seguro extends ElementoA{

    private int poliza;
    private String descripcion;
    private double montoAsegurado;
    private CalculadorCosto calculador;

    public Seguro(int dni, int poliza, String descripcion, double montoAsegurado, CalculadorCosto calculador) {
        super(dni);
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.calculador = calculador;
    }

    public double calcularCostoPoliza(){
        return getCalculador().calcular(this);
    }

    @Override
    public List<ElementoA> buscarSeguros(Buscador b) {
        List<ElementoA>seguro=new ArrayList<>();
        if (b.cumple(this)){
            seguro.add(this);
        }
        return seguro;
    }

    public String toString(){
        return super.toString()+" Poliza: "+poliza+" Descripcion: "+descripcion+ " Monto Asegurado: "+montoAsegurado+"»";
    }
    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public CalculadorCosto getCalculador() {
        return calculador;
    }

    public void setCalculador(CalculadorCosto calculador) {
        this.calculador = calculador;
    }
}
