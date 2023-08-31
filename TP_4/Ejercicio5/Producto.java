package TP_4.Ejercicio5;

import java.time.LocalDate;
import java.util.Properties;

public class Producto {

    private String nombre;
    private LocalDate fechaVencimiento;
    private int nroLote;

    public Producto(String nombre,LocalDate fechaVencimiento,int nroLote){
        this.nombre=nombre;
        this.fechaVencimiento=fechaVencimiento;
        this.nroLote=nroLote;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public String toString(){
        return "Nombre: "+nombre+" Fecha Vencimiento: "+fechaVencimiento+" Numero Lote: "+nroLote;
    }

}
