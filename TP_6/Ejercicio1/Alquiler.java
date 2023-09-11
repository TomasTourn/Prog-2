package TP_6.Ejercicio1;

import java.time.LocalDate;
import java.util.List;



public class Alquiler {

    private Item item;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Cliente cliente;

    public Alquiler(Item item, LocalDate fechaInicio, LocalDate fechaFin, Cliente cliente) {

        if(item.alquilar()){
            this.item = item;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.cliente = cliente;
        }
    }

    public String toString(){
        return "se alquiló "+ item.getNombre();
    }
    public boolean equals(Object o){
        Alquiler a=(Alquiler) o;
        try {
            return a.item.equals(this.getItem()) && a.getCliente().equals(this.getCliente()) && a.getFechaInicio()==this.getFechaInicio();
        }catch (Exception e){
            return false;
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
