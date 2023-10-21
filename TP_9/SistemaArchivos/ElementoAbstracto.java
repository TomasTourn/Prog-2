package TP_9.SistemaArchivos;

import java.time.LocalDate;

public abstract class ElementoAbstracto {

    private final String nombre;
    private final LocalDate fechaCreacion;

    public ElementoAbstracto(String nombre) {
        this.nombre = nombre;
        fechaCreacion=LocalDate.now();
    }

        public abstract double getTamanio();

    public abstract int cantArchivos();

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
