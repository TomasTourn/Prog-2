package Parciales.ParcialEgresados;

import Parciales.ParcialEgresados.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Egresado extends ElementoViaje{

    private double precio;
    private double deuda;

    public Egresado(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso, double precio, double deuda) {
        super(nombre, destino, fechaPartida, fechaRegreso);
        this.precio = precio;
        this.deuda = deuda;
    }

    @Override
    public ElementoViaje getCopia() {
        return new Egresado(getNombre(),getDestino(),getFechaPartida(),getFechaRegreso(),getPrecio(),getDeuda());
    }

    @Override
    public List<ElementoViaje> buscarElementos(Condicion c) {
        List<ElementoViaje>egresado=new ArrayList<>();
            if (c.cumple(this))
                egresado.add(this);
            return egresado;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int cantAlumnos() {
        return 1;
    }

    public Egresado conMayorDeuda(){
        return this;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
}
