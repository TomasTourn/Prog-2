package TP_9.SistemaArchivos.Buscadores;

import TP_9.SistemaArchivos.ElementoAbstracto;

import java.time.LocalDate;

public class BuscadorFechaAnterior implements Buscador{

    private LocalDate fechaBuscada;
    @Override
    public boolean cumple(ElementoAbstracto e) {
        return fechaBuscada.isBefore(e.getFechaCreacion());
    }

    public BuscadorFechaAnterior(LocalDate fechaBuscada) {
        this.fechaBuscada = fechaBuscada;
    }
}
