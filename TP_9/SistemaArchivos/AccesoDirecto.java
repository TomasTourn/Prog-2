package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.Buscador;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccesoDirecto extends ElementoAbstracto{

    private ElementoAbstracto elemento;//apunta a este elemento
    private static final int TAMANIO=1;
    private static final String PREFIJO="Acceso Directo a ";
    public AccesoDirecto(ElementoAbstracto elemento) {
        super(PREFIJO+elemento.getNombre());
        this.elemento = elemento;
    }

    @Override
    public List<ElementoAbstracto> buscarElementos(Buscador b, ComparadorElemento c) {
        List<ElementoAbstracto> el=new ArrayList<>();

        if (b.cumple(this)){
            el.add(this);
        }
        Collections.sort(el,c);
        return el;
    }
    public String toString(){
        return super.toString()+ " Tamaño= "+getTamanio();
    }
    @Override
    public int cantArchivos() {
        return 0;
    }
    @Override
    public double getTamanio() {
        return TAMANIO;
    }
}
