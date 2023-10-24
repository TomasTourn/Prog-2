package TP_9.Ejercicio5;

import TP_9.Ejercicio5.Buscadores.Buscador;
import TP_9.Ejercicio5.Calculadores.CalculadorCosto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroTemporal extends Seguro{

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public SeguroTemporal(int dni, int poliza, String descripcion, double montoAsegurado, CalculadorCosto calculador, LocalDate fechaInicio, LocalDate fechaFin) {
        super(dni, poliza, descripcion, montoAsegurado, calculador);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public boolean esValido(){
        LocalDate diaActual=LocalDate.now();
        if (diaActual.isAfter(fechaInicio)&& diaActual.isBefore(fechaFin))
            return true;
        else
            return false;
    }
    @Override
    public double getMontoAsegurado(){
        if(esValido())
            return super.getMontoAsegurado();
        else{
            return 0;}
    }

    @Override
    public double calcularCostoPoliza() {
        if (esValido())
            return super.getCalculador().calcular(this);
        else
            return 0;
    }

    @Override
    public List<ElementoA> buscarSeguros(Buscador b) {
        List<ElementoA>segTemporal=new ArrayList<>();
        if (esValido())
        return super.buscarSeguros(b);
        else
            return segTemporal;
    }
}
