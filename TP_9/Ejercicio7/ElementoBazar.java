package TP_9.Ejercicio7;

import TP_9.Ejercicio7.Condiciones.Condicion;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.util.List;

public abstract class ElementoBazar {

    public abstract List<String> getCategorias();
    public abstract double getPrecio();
    public abstract boolean esAgregable(Condicion c);
    public abstract int cantProductos();
    public abstract double getPeso();

    public abstract Producto productoMasLiviano();
    public abstract List<ElementoBazar>buscarElementos(Condicion c, ComparadorElemento comp);
    public abstract boolean poseeCategoria(String s);


}
