package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.Buscador;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carpeta extends ElementoAbstracto{

    private List<ElementoAbstracto>elementos;


    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoAbstracto e){
        if(!elementos.contains(e)){
            elementos.add(e);
            e.setPadre(this);//al agregarlo, le digo q soy el padre
        }

    }

    public List<ElementoAbstracto> buscarElementos(Buscador b, ComparadorElemento c){
        List<ElementoAbstracto>el=new ArrayList<>();
        for (ElementoAbstracto e:elementos) {
            el.addAll(e.buscarElementos(b,c));
        }
        Collections.sort(el,c);
        return el;
    }

    public double getTamanio(){
        double t=0;
        for (ElementoAbstracto e:elementos) {
            t+=e.getTamanio();
        }
        return t;
    }

    @Override
    public int cantArchivos() {
        int cant=0;
        for (ElementoAbstracto e:elementos) {
            cant+=e.cantArchivos();
        }
        return cant;
    }

}
