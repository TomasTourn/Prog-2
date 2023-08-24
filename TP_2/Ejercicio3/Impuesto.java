package TP_2.Ejercicio3;

public class Impuesto {

    private String nombreImpuesto;
    private String descripcion;
    private double montoRecaudado;




    public Impuesto(String nombreImpuesto, String descripcion, double montoRecaudado) {
        this.setNombreImpuesto(nombreImpuesto);
        this.setDescripcion(descripcion);
        this.setMontoRecaudado(montoRecaudado);
    }

    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(double montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
}

