package TP_4.Ejercicio5;

import java.sql.Time;
import java.time.LocalDate;

public class CongeladoConNitrogeno extends ProductoRefrigerado{

    private String metodoCongelacion;
    private double exposicionAlnitrogeno;//en segundos

    public CongeladoConNitrogeno(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOrganismoSupervision, double temperaturaMantenimiento,String metodoCongelacion,double exposicionAlnitrogeno) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismoSupervision, temperaturaMantenimiento);
        this.metodoCongelacion=metodoCongelacion;
        this.exposicionAlnitrogeno=exposicionAlnitrogeno;
    }


    @Override
    public String toString(){
        return super.toString()+ " Metodo de Congelacion: "+metodoCongelacion+" Tiempo de Exposicion al Nitrogeno: "+exposicionAlnitrogeno;
    }
    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getExposicionAlnitrogeno() {
        return exposicionAlnitrogeno;
    }

    public void setExposicionAlnitrogeno(double exposicionAlnitrogeno) {
        this.exposicionAlnitrogeno = exposicionAlnitrogeno;
    }
}

