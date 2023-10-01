package TP_7.Ejercicio4;

public class FichaEspecial {

    private String nombre;
    private int fortaleza;
    private int espacio;
    private int poderDestruccion;


    public FichaEspecial(String nombre, int espacio,int fortaleza) {
        this.nombre = nombre;
        this.espacio = espacio;
        this.fortaleza = fortaleza;
        poderDestruccion=getPoderDestruccion();
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getPoderDestruccion() {
        return fortaleza/espacio;
    }


}
