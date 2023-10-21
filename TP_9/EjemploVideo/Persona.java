package TP_9.EjemploVideo;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;


    public Persona(String nombre, String apellido,int edad,int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad=edad;
        this.dni=dni;
    }

    public int compareTo(Persona p){//comparador por defecto, compara por apellido
       return this.getApellido().compareTo(p.getApellido());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public boolean Equals(Persona p){
        try{
            return nombre.equals(p.getNombre());
        }
        catch (Exception e){
            return false;
        }
    }

    public String toString(){
        return nombre+" "+ apellido+" "+edad;
    }

}
