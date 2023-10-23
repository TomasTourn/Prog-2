package Parciales.Parcial2022;

import Parciales.Parcial2022.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends ElementoPE{

    private String texto;
    private String titulo;
    private String autor;

    public Noticia(String categoria, String texto, String titulo, String autor) {
        super(categoria);
        this.texto = texto;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return "\nTitulo: "+titulo+" Texto: "+texto+" Autor: "+autor+super.toString();
    }

    @Override
    public List<Noticia> buscarNoticias(Buscador b) {

        List<Noticia>noticia=new ArrayList<>();
        if (b.cumple(this)){
            noticia.add(this);
        }
        return noticia;
    }

    @Override
    public void agregarPalabra(AgregadorPalabras a) {
        for (String s:a.agregar(this)) {
                super.addPalabraClave(s);
        }
    }
}
