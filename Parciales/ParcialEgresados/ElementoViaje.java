package Parciales.ParcialEgresados;

import Parciales.ParcialEgresados.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoViaje {

    private String nombre;
    private String destino;
    private LocalDate fechaPartida;
    private LocalDate fechaRegreso;

    public ElementoViaje(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaPartida = fechaPartida;
        this.fechaRegreso = fechaRegreso;
    }

    public abstract double getPrecio();
    public abstract double getDeuda();
    public abstract int cantAlumnos();
    public abstract Egresado conMayorDeuda();
    public abstract ElementoViaje getCopia();
    public abstract List<ElementoViaje>buscarElementos(Condicion c);















    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(LocalDate fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
}
