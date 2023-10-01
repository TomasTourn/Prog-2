package TP_7.Ejercicio5.Buscadores;

import TP_7.Ejercicio5.Pelicula;

public class porActor extends Buscar{

    private String actor;

    public porActor(String actor) {
        this.actor = actor.toLowerCase();
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getActores().contains(actor);
    }
}
