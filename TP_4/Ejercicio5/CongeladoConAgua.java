package TP_4.Ejercicio5;

import java.time.LocalDate;

public class CongeladoConAgua extends ProductoRefrigerado{

    private double gramosSal;
    private int mlAgua;

    public CongeladoConAgua(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOrganismoSupervision, double temperaturaMantenimiento,double gramosSal) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismoSupervision, temperaturaMantenimiento);
            this.gramosSal=gramosSal;
            this.mlAgua=100;
    }

    @Override
    public String toString(){
        return super.toString()+" " +gramosSal +" Gramos de sal cada "+mlAgua +" ml de agua ";
    }
    public double getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(double gramosSal) {
        this.gramosSal = gramosSal;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }
}
