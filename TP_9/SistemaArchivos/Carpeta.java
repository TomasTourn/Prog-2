package TP_9.SistemaArchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends ElementoAbstracto{

    private List<ElementoAbstracto>elementos;


    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoAbstracto e){
        if(!elementos.contains(e))
            elementos.add(e);
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
