package TP_4.Ejercicio5;

import java.time.LocalDate;

public class CongeladoConAire extends ProductoRefrigerado{

    //porcentajes
    private double nitrogeno;
    private double oxigeno;
    private double dioxido;
    private double carbono;
    private double vaporAgua;

    public CongeladoConAire(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOrganismoSupervision, double temperaturaMantenimiento,double nitrogeno,double oxigeno, double dioxido, double carbono, double vaporAgua) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismoSupervision, temperaturaMantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxido = dioxido;
        this.carbono = carbono;
        this.vaporAgua = vaporAgua;
    }
    @Override
    public String toString(){
        return super.toString()+ " % nitrogeno: "+ nitrogeno+" % oxigeno: "+ oxigeno+" % dioxido: "+ dioxido+" % carbono: "+ carbono+" % vaporAgua: "+ vaporAgua;
    }


    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxido() {
        return dioxido;
    }

    public void setDioxido(double dioxido) {
        this.dioxido = dioxido;
    }

    public double getCarbono() {
        return carbono;
    }

    public void setCarbono(double carbono) {
        this.carbono = carbono;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }
}


