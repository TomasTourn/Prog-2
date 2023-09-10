package TP_5.Libreria;

import java.util.ArrayList;
import java.util.List;

public class Articulo {

    private String nombre;
    private String autor;
    private double precio;
    private int cantPaginas;
    private String resumen;
    private List<String> generos;

    public Articulo(String nombre,String autor,double precio,int cantPaginas,String resumen){
        this.nombre=nombre;
        this.autor=autor;
        this.precio=precio;
        this.cantPaginas=cantPaginas;
        this.resumen=resumen;
        generos=new ArrayList<>();
    }

    public void agregarGenero(String genero){
        if(!generos.contains(genero)){
            generos.add(genero);
        }
    }

    public boolean equals(Object o){
        //recibo un objeto y lo casteo a articulo
        Articulo a = (Articulo) o;
        try{// se usa try catch en vez de if por las dudas de que haya una expecion, por ejemplo dos objetos no son comparables
            return a.getNombre().equalsIgnoreCase(this.getNombre())&& a.getAutor().equalsIgnoreCase(this.getAutor());
        }
        catch (Exception exc){
            return false;
        }

    }

    public List<String> getGeneros() {
        return generos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
