package Parciales.ParcialEgresados;

import Parciales.ParcialEgresados.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contingente extends ElementoViaje{

    private List<ElementoViaje>elementos;
    private Condicion c;

    public Contingente(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso, Condicion c) {
        super(nombre, destino, fechaPartida, fechaRegreso);
        this.c = c;
        this.elementos=new ArrayList<>();
    }

    public void addElemento(ElementoViaje e){
        if (e!=null && !elementos.contains(e))
                if (c.cumple(e))
                        elementos.add(e);
    }

    @Override
    public double getPrecio() {
        double precio=0;

        for (ElementoViaje e:elementos) {
                precio+=e.getPrecio();
        }
        return precio;
    }

    @Override
    public double getDeuda() {
        double deuda=0;
        for (ElementoViaje e:elementos) {
            deuda+=e.getDeuda();
        }
        return deuda;
    }

    @Override
    public int cantAlumnos() {
        int cant=0;
        for (ElementoViaje e:elementos) {
                cant+=e.cantAlumnos();
        }
        return cant;
    }

    @Override
    public Egresado conMayorDeuda() {
        double mayorDeuda=0;
        Egresado egresado=null;
        for (ElementoViaje e:elementos) {
                if (e.getDeuda()>mayorDeuda){
                    mayorDeuda=e.getDeuda();
                    egresado=e.conMayorDeuda();
                }
        }
        return egresado;
    }

    @Override
    public ElementoViaje getCopia() {
        Contingente copia=new Contingente(getNombre(),getDestino(),getFechaPartida(),getFechaRegreso(),getC());
        for (ElementoViaje e:elementos) {
            copia.addElemento(e);
        }
        return copia;

    }

    @Override
    public List<ElementoViaje> buscarElementos(Condicion c) {
        List<ElementoViaje>buscado=new ArrayList<>();
            if (c.cumple(this)) {
                buscado.add(this);
            }
            else{
                for (ElementoViaje e:elementos) {
                    buscado.addAll(e.buscarElementos(c));
                }
            }
            return buscado;
    }

    public Condicion getC() {
        return c;
    }

    public void setC(Condicion c) {
        this.c = c;
    }
}
