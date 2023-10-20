package TP_8.Ejercicio2;

public class Nodo {

    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda =null;
        this.derecha=null;
    }


    public void addValor(int valor){
             if(valor>this.valor){
                 izquierda=new Nodo(valor);
             }
    }


}
