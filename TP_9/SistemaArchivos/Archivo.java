package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.Buscador;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Archivo extends ElementoAbstracto{

    private String extension;
    private double tamanio;
    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    @Override
    public List<ElementoAbstracto> buscarElementos(Buscador b, ComparadorElemento c) {
        List<ElementoAbstracto>el=new ArrayList<>();

        if (b.cumple(this)){
            el.add(this);
        }
        Collections.sort(el,c);
        return el;
    }

    public String toString(){
        return "\n"+getNombre()+"."+getExtension()+" Fecha= "+getFechaCreacion()+ " Tamaño= "+tamanio;
    }
    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantArchivos() {
        return 1;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
