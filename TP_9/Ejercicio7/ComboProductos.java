package TP_9.Ejercicio7;

import TP_9.Ejercicio7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class ComboProductos extends ElementoBazar{

    private double descuentoIndividual;
    private double descuentoMaximo;
    private Condicion condicion;
    private List<ElementoBazar> elementos;


    public ComboProductos(double descuentoIndividual, double descuentoMaximo, Condicion condicion) {
        this.descuentoIndividual = descuentoIndividual;
        this.descuentoMaximo = descuentoMaximo;
        this.condicion = condicion;
        this.elementos = elementos;
    }

    @Override
    public boolean esAgregable(Condicion c) {
            boolean agregable=true;
        for (ElementoBazar e:elementos) {
                if (!e.esAgregable(c))
                    agregable=false;
        }
        return agregable;
    }

    public void addElemento(ElementoBazar e){
        if(e!=null&&!elementos.contains(e))
                if (e.esAgregable(condicion)){
                    elementos.add(e);
                }
    }

    public int cantProductos(){
        int cant=0;
        for (ElementoBazar e:elementos) {
                cant+=e.cantProductos();
        }
        return cant;
    }
    @Override
    public double getPrecio() {
        double precio=0;
        double descuento=0;
        for (ElementoBazar e:elementos) {
            precio+=e.getPrecio();
            descuento=e.getPrecio()*descuentoIndividual;//voy  acumulando descuento
        }
        if (precio*descuentoMaximo>descuento){// si el descuento es menor al descuento maximo lo aplico
            return precio-descuento;
        }
        else
            return precio-precio*descuentoMaximo;//sino devuelvo con el descuento maximo aplicado
    }

    @Override
    public double getPeso() {
        double peso=0;
        for (ElementoBazar e:elementos) {
                peso+=e.getPeso();
        }
        return peso;
    }

    @Override
    public List<String> getCategorias() {
        List<String>categorias=new ArrayList<>();
        for (ElementoBazar e:elementos) {
            for (String s:e.getCategorias()) {//recorro las categorias del elemento
                    if (!categorias.contains(s))//si la categoria no esta la agrego
                         categorias.add(s);
            }
        }
        return categorias;
    }

    @Override
    public List<ElementoBazar> buscarElementos(Condicion c) {
        List<ElementoBazar>buscados=new ArrayList<>();

        if (c.cumple(this)){//si el combo cumple se agrega
            buscados.add(this);
        }
        else {
            for (ElementoBazar e:elementos) {//sino busca en los productos/combos hijos
                buscados.addAll(e.buscarElementos(c));
            }
        }
        return buscados;
    }

    public Producto productoMasLiviano(){
        Producto p=null;
        double pesoMinimo=Double.MAX_VALUE;
        for (ElementoBazar e:elementos) {
                if (e.getPeso()<pesoMinimo){
                    pesoMinimo=e.getPeso();
                    p=e.productoMasLiviano();
                }
        }
        return p;
    }

    @Override
    public boolean poseeCategoria(String s) {
        for (ElementoBazar e:elementos) {
            if (e.poseeCategoria(s))
                return true;
        }
        return false;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
    public double getDescuentoIndividual() {
        return descuentoIndividual;
    }

    public void setDescuentoIndividual(double descuentoIndividual) {
        this.descuentoIndividual = descuentoIndividual;
    }

    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }

    public void setDescuentoMaximo(double descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }

    public List<ElementoBazar> getElementos() {
        return new ArrayList<>(elementos);
    }
}
