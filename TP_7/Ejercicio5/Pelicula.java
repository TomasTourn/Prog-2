package TP_7.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String titulo;
    private String sinopsis;
    private List<String> generos;
    private String director;
    private List<String> actores;
    private int anioEstreno;
    private int duracion;//minutos
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo.toLowerCase();
        this.sinopsis = sinopsis.toLowerCase();
        this.director = director.toLowerCase();
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }
    public void addGenero(String g){
        if(g!=null && !generos.contains(g))
            generos.add(g.toLowerCase());
    }
    public void addActores(String a){
        if(a!=null && !actores.contains(a))
            actores.add(a.toLowerCase());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<String> getGeneros() {
        List<String>copia=new ArrayList<>();
        copia.addAll(generos);
        return copia;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActores() {
        List<String>copia=new ArrayList<>();
        copia.addAll(actores);
        return copia;
    }



    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
}
