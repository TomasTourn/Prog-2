package TP_7.Ejercicio4;

public class Ficha extends FichaEspecial{

    private int poderDestruccion;
    public Ficha(String nombre, int espacio, int fortaleza,int poderDestruccion) {
        super(nombre, espacio, fortaleza);
        this.poderDestruccion=poderDestruccion;
    }
}
