package TP_4.Ejercicio3;

public class EmpleadoConComision extends Empleado{

    private double extraPorVenta;// uso extra por venta porque si uso un porcentaje por comision tendria que calcular el precio de cada venta(creo).
    private int cantVentas;

    public EmpleadoConComision(String nombre,int legajo,double sueldo,double getExtraPorVenta,int cantVentas){
        super(nombre, legajo, sueldo);
        this.extraPorVenta=getExtraPorVenta;
        this.cantVentas=cantVentas;
    }

    @Override
    public double getSueldo(){
        return super.getSueldo()+(this.getExtraPorVenta()*this.getCantVentas());
    }

    public double getExtraPorVenta() {
        return extraPorVenta;
    }

    public void setExtraPorVenta(double extraPorVenta) {
        this.extraPorVenta = extraPorVenta;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
}
