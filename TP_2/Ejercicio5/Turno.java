package TP_2.Ejercicio5;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Turno {

    private LocalDateTime fechaTurno;
    private Peluquero peluquero;
    private Cliente cliente;
    private double descuentoFrecuentes;
    private double precio;


    public Turno( LocalDateTime fechaTurno,Peluquero peluquero, Cliente cliente,double precio){

        if(peluquero.isDisponible(fechaTurno)){
            this.peluquero=peluquero;
            System.out.println("disponible");
        }else{
            System.out.println("el peluquero esta ocupado");
        }

        this.fechaTurno=fechaTurno;
        this.cliente=cliente;
        this.precio=precio;
        this.descuentoFrecuentes=10;
        //checkear si es frecuente y aplicar descuento
        cliente.actualizarTurno(fechaTurno);

        if(cliente.esFrecuente()){
            this.aplicarDescuento();
        }
            peluquero.setOcupado(fechaTurno.getHour());
    }

    public void aplicarDescuento(){

        double descuento= (this.descuentoFrecuentes/100)*this.precio;

        this.precio=precio-descuento;
    }




    public double getDescuentoFrecuentes() {
        return descuentoFrecuentes;
    }

    public void setDescuentoFrecuentes(double descuentoFrecuentes) {
        this.descuentoFrecuentes = descuentoFrecuentes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
