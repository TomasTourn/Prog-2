package TP_6.Ejercicio3;

public class Barco {

    private double capacidad;

    public Barco(double capacidad){
        this.capacidad=capacidad;
    }
    public void cargar(){
        System.out.println("se cargo el barco de capacidad: "+capacidad );
    }

    public double getCapacidad() {
        return capacidad;
    }
}
