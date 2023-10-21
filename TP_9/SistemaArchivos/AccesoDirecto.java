package TP_9.SistemaArchivos;

public class AccesoDirecto extends ElementoAbstracto{



    private ElementoAbstracto elemento;//apunta a este elemento
    private static final int TAMANIO=1;
    private static final String PREFIJO="Acceso Directo a ";
    public AccesoDirecto(ElementoAbstracto elemento) {
        super(PREFIJO+elemento.getNombre());
        this.elemento = elemento;
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
