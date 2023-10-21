package TP_9.SistemaArchivos.Comparadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

import java.time.LocalDate;

public class CompararFecha extends ComparadorElemento{

    public CompararFecha() {
    }

    public CompararFecha(ComparadorElemento siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(ElementoAbstracto e1, ElementoAbstracto e2) {
       return e1.getFechaCreacion().compareTo(e2.getFechaCreacion());
    }
}
