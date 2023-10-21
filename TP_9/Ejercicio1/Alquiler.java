package TP_9.Ejercicio1;

import java.time.LocalDate;

public class Alquiler {

    private LocalDate fecha;
    private int idCancha;
    private double pago;

    public Alquiler(LocalDate fecha, int idCancha, double pago) {
        this.fecha = fecha;
        this.idCancha = idCancha;
        this.pago = pago;
    }

    public String toString(){
        return fecha +" "+idCancha +" "+pago;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
}
