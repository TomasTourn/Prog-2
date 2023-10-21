package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.Buscador;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoAbstracto {

    private  String nombre;
    private  LocalDate fechaCreacion;
    private Carpeta padre;

    public ElementoAbstracto(String nombre) {
        this.nombre = nombre;
        fechaCreacion=LocalDate.now();
    }

    public abstract double getTamanio();

    public abstract int cantArchivos();

    public String toString(){
        return "\n"+nombre+" Fecha= "+fechaCreacion;
    }

    public abstract List<ElementoAbstracto> buscarElementos(Buscador b, ComparadorElemento c);
    public String getPath(){
        if(this.getPadre()!=null){
            return this.getPadre().getNombre()+"/"+this.getNombre();
        }
        else return this.getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Carpeta getPadre() {
        return padre;
    }

    public void setPadre(Carpeta padre) {
        this.padre = padre;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
