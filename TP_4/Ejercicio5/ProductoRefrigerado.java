package TP_4.Ejercicio5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco{

    private int codigoOrganismoSupervision;
    private double temperaturaMantenimiento;

    public ProductoRefrigerado(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,int codigoOrganismoSupervision,double temperaturaMantenimiento){
        super(nombre, fechaVencimiento, nroLote,fechaEnvasado,granjaOrigen);
        this.codigoOrganismoSupervision=codigoOrganismoSupervision;
        this.temperaturaMantenimiento=temperaturaMantenimiento;
    }

    public int getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(int codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
@Override
    public String toString(){
        return super.toString()+ " Codigo Organismo de Supervision: "+codigoOrganismoSupervision+ " Temperatura de Mantenimiento: "+temperaturaMantenimiento;
    }

}
