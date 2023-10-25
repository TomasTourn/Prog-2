package TP_9.Ejercicio7;

import TP_9.Ejercicio7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Producto extends ElementoBazar{

    private double precio;
    private double peso;
    private List<String>categorias;

    public Producto(double precio, double peso, List<String> categorias) {
        this.precio = precio;
        this.peso = peso;
        this.categorias = categorias;
    }
    public boolean esAgregable(Condicion c){
       return c.cumple(this);
    }
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int cantProductos() {
        return 1;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List<String> getCategorias() {
        return new ArrayList<>(categorias) ;
    }

    public boolean poseeCategoria(String s){
        return categorias.contains(s);
    }
    public List<ElementoBazar>buscarElementos(Condicion c){
        List<ElementoBazar>elemento=new ArrayList<>();
        if (c.cumple(this))
             elemento.add(this);
        return elemento;
    }

    @Override
    public Producto productoMasLiviano() {
        return this;
    }
}
