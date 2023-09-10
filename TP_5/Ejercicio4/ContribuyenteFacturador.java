package TP_5.Ejercicio4;

public class ContribuyenteFacturador extends Contribuyente{

    private double montoFacturado;
    private double porcentajeImpuesto;
    private double porcentajeFacturado;

    //unifico contibuyente programador y comerciante porque solo cambian los %
    public ContribuyenteFacturador(String nombre, int id, double impuesto,double montoFacturado,double porcentajeImpuesto,double porcentajeFacturado){
        super(nombre, id, impuesto);
        this.montoFacturado=montoFacturado;
        this.porcentajeImpuesto=porcentajeImpuesto;
        this.porcentajeFacturado=porcentajeFacturado;
    }

    @Override
    public double getImpuesto(){
        return (super.getImpuesto()*porcentajeImpuesto)+(montoFacturado*porcentajeFacturado);
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    public double getPorcentajeFacturado() {
        return porcentajeFacturado;
    }

    public void setPorcentajeFacturado(double porcentajeFacturado) {
        this.porcentajeFacturado = porcentajeFacturado;
    }
}
