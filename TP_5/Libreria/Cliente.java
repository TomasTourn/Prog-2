package TP_5.Libreria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private int dni;
    private String direccion;
    protected List<String> generosFav;
    private List<String> autoresFavoritos;
    private List<Articulo> compras;
    private double descuento;
    public Cliente(String nombre, int dni, String direccion,double descuento) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento=descuento;
        generosFav=new ArrayList<>();
        autoresFavoritos=new ArrayList<>();
        compras=new ArrayList<>();
    }


    public void agregarGenero(String genero){
        if(!generosFav.contains(genero)){
            generosFav.add(genero);
        }
    }
    public void agregarAutor(String autor){
        if(!generosFav.contains(autor)){
            generosFav.add(autor);
        }
    }
    public void agregarCompra(Articulo articulo){

        //equals redefinido en articulo
        if(!compras.contains(articulo)){
            compras.add(articulo);
        }

    }
    public boolean leGusta(Articulo a){
        return autoresFavoritos.contains(a.getAutor());
    }
    public boolean yaCompro(Articulo a){
        return compras.contains(a);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}

