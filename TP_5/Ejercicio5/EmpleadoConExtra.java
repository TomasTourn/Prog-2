package TP_5.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoConExtra extends Empleado{


    protected List<Venta>ventas;
    private double extraPorVentas;
    public EmpleadoConExtra(String nombre, String apellido, int dni, double sueldo,double extraPorVentas) {
     super(nombre, apellido, dni, sueldo);
     this.extraPorVentas=extraPorVentas;
     ventas=new ArrayList<>();
    }

    public void agregarVenta(Venta v){
        if(!ventas.contains(v))
            ventas.add(v);
    }

    @Override
    public double getSueldo(){
        return super.getSueldo()+(getSumaVentas()*extraPorVentas);
    }
    public double getSumaVentas(){//retorna el monto total de las ventas
        double montoTotal=0;
        for (Venta v:ventas) {
            montoTotal+=v.getMonto();
        }
        return montoTotal;
    }



}
