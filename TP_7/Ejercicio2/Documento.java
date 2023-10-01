package TP_7.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    private String titulo;
    private List<String> autores;
    private String contenido;
    private List<String> palabrasClave;

    public Documento(String titulo,String contenido){
        this.titulo=titulo;
        autores=new ArrayList<>();
        this.contenido=contenido;
        palabrasClave=new ArrayList<>();
    }

    public void addAutor(String autor){
        if(autor!=null && !autores.contains(autor)){
            autores.add(autor);
        }
    }
    public void addPalabraClave(String p){
        if(p!=null && !palabrasClave.contains(p)){
            palabrasClave.add(p);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getPalabrasClave(){
        List<String> copiaPalabras= new ArrayList<>();

        copiaPalabras.addAll(palabrasClave);

        return copiaPalabras;
    }
    public List<String> getAutores(){
        List<String> copiaAutores= new ArrayList<>();

        copiaAutores.addAll(autores);

        return copiaAutores;
    }


}
