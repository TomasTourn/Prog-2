package TP_9.Ejercicio3;

public class Persona {

    private int dni;

    public int getDni() {
        return dni;
    }

    public boolean equals(Persona p){
        try{
            return p.getDni()==dni;
        }
        catch (Exception e){
            return false;
        }
    }
    public String toString(){
        return "Dni= "+dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(int dni) {
        this.dni = dni;
    }
}
