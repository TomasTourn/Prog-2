package TP_6.Ejercicio1;

public abstract class Item {

    private String nombre;
    private String descripcion;
    private double precio;

    public Item(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public boolean equals(Object o){
        Item i =(Item) o;//?
        try {
            return i.getNombre().equalsIgnoreCase(this.getNombre()) && i.getDescripcion().equalsIgnoreCase(this.getDescripcion())  ;

        }catch (Exception e){
            return false;
        }
    }

    public abstract boolean estaDisponible();

    public abstract boolean alquilar();
    public abstract void devolver(Item i);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
