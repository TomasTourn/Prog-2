package TP_9.Ejercicio3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ubicacion extends ElementoAbstracto{

    private String nombre;
    private List<ElementoAbstracto> elementos;

    public Ubicacion(String nombre) {
        this.nombre=nombre;
        elementos=new ArrayList<>();
    }

    public void addElemento(ElementoAbstracto e){
        if(!elementos.contains(e))
            elementos.add(e);
    }

    @Override
    public int cantVotos() {
        int cant=0;
        for (ElementoAbstracto e:elementos) {
            cant+=e.cantVotos();
        }
        return cant;
    }

    @Override
    public int cantVotosA(Candidato c) {
        int cant=0;
        for (ElementoAbstracto e:elementos) {
            cant+=e.cantVotosA(c);
        }
        return cant;
    }

    @Override
    public int cantEnBlanco() {
        int cant=0;
        for (ElementoAbstracto e:elementos) {
            cant+=e.cantEnBlanco();
        }
        return cant;
    }


    @Override
    public int votosEntre(LocalTime t1, LocalTime t2) {
        int cant=0;
        for (ElementoAbstracto e:elementos) {
                cant+=e.votosEntre(t1,t2);
        }
        return cant;
    }

    @Override
    public List<Candidato> getCandidatos() {
        List<Candidato>candidatos=new ArrayList<>();

        for (ElementoAbstracto e:elementos) {
                    candidatos.addAll(e.getCandidatos());
        }
        return candidatos;

    }
}
