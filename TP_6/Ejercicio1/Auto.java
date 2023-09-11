package TP_6.Ejercicio1;

public class Auto extends  Item{

    private String marca;
    private double km;
    private String patente;
    private boolean disponible;
    public Auto(String nombre, String descripcion, double precio,String marca,double km,String patente){
        super(nombre, descripcion, precio);
        this.marca=marca;
        this.km=km;
        this.patente=patente;
    }

    @Override
    public boolean equals(Object o){
        Auto a=(Auto) o;

        try {
            return a.getMarca().equalsIgnoreCase(this.marca) && a.getPatente().equalsIgnoreCase(this.patente);
        }catch (Exception e){
            return false;
        }
    }


    @Override
    public boolean alquilar(){
        if(estaDisponible()){
            disponible=false;
            return true;
        }

        return false;
    }
    @Override
    public void devolver(Item a){
        if (a.equals(this))
            disponible=true;
    }
    @Override
    public boolean estaDisponible(){
        return  disponible;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
