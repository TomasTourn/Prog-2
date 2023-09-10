package TP_5.Ejercicio4;

public class Contribuyente {

    private String nombre;
    private int id;
    private double impuesto;

    public Contribuyente(String nombre, int id, double impuesto) {
        this.nombre = nombre;
        this.id = id;
        this.impuesto = impuesto;
    }


    public boolean equals(Object o){
        Contribuyente c = (Contribuyente) o;
        try{
            return c.getNombre().equalsIgnoreCase(this.getNombre())&&c.getId()==this.getId();
        }catch (Exception exc){
            return false;
        }
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
