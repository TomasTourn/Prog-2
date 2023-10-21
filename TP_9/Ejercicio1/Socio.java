package TP_9.Ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Socio {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private List<Alquiler> alquileres;


    public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        this.alquileres = new ArrayList<>();
    }

    public boolean pagoMasDe(double p){
        for (Alquiler a:alquileres) {
            if (a.getPago()>=p){
                return true;
            }
        }
        return false;
    }
    public boolean IDCanchaPresente(int id){
        for (Alquiler a:alquileres) {
            if (a.getIdCancha()==id){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return nombre+" "+ apellido +" "+ edad+ " "+cuotaPaga+" alquileres: "+ alquileres+ "\n";
    }

    public void addAlquiler(Alquiler a){
        if(!alquileres.contains(a))
            alquileres.add(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }
}
