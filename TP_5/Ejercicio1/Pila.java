package TP_5.Ejercicio1;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Pila<O> {//el tipo de objeto que pasen al instanciar pila define el tipo de arreglo

    private List<O> elementos;
    private String nombrePila;

    public Pila(){
        this.elementos=new ArrayList<O>();
    }
    public Pila(String nombrePila){
        this();
        this.nombrePila=nombrePila;
    }

    public void push(O o){
        elementos.add(o);
    }

    public Object top(){
        return elementos.get(elementos.size()-1);//retorna ultima posicion (tamaño menos uno)
    }

    public void pop(){
        elementos.remove(this.top());//elimino el ultimo
    }

    public int size(){
        return elementos.size();
    }
    public Pila<O> copy(){
        Pila<O>copiaPila=new Pila<>();
        copiaPila.elementos.addAll(this.elementos);
        return copiaPila;
    }

    public Pila<O> reverse(){
        Pila<O>PilaInversa=new Pila<>();

      for (int i=elementos.size()-1;i>=0;i--)
          PilaInversa.push(elementos.get(i));
        return PilaInversa;
    }




}
