package TP_9.SistemaArchivos;

import TP_9.SistemaArchivos.Buscadores.Buscador;
import TP_9.SistemaArchivos.Comparadores.ComparadorElemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comprimido extends Carpeta{

    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public List<ElementoAbstracto> buscarElementos(Buscador b, ComparadorElemento c) {

        List<ElementoAbstracto>el=new ArrayList<>();
            boolean encontro=false;

        for (ElementoAbstracto e:super.buscarElementos(b,c)) {
                if (b.cumple(e)){
                    encontro=true;
                }
        }
        if(encontro){//si algun elemento cumple me agrego a mi mismo al array
            el.add(this);
        }
        Collections.sort(el,c);
        return el;


    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }
}
