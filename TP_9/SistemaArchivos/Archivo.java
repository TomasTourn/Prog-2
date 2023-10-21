package TP_9.SistemaArchivos;

public class Archivo extends ElementoAbstracto{

    private String extension;
    private double tamanio;
    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String toString(){
        return getNombre()+"."+extension;
    }
    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantArchivos() {
        return 1;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
