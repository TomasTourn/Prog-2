package TP_1.Ejercicio2;

public class Electrodomestico {

    private String nombre;
    private double precio;
    private String color;
    private double consumo;
    private double peso;




    public Electrodomestico(String nombre){
        this(nombre,100);
    }

    public Electrodomestico(String nombre,double precio){
        this(nombre,precio,"gris plata");
    }

    public Electrodomestico(String nombre,double precio,String color){
        this(nombre,precio,color,10);
    }

    public Electrodomestico(String nombre,double precio,String color,double consumo){
        this(nombre,precio,color,consumo,2);
    }
    public Electrodomestico(String nombre,double precio, String color,double consumo,double peso){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setColor(color);
        this.setConsumo(consumo);
        this.setPeso(peso);
    }

    //metodos

    public boolean bajoConsumo(){
        return this.consumo<45;
    }
    public double balance(){
        return precio/peso;
    }
    public boolean esAltaGama(){
        return this.balance()>3;
    }

    public String  getData(){
        return nombre+ " " +precio+ " " +color+ " " +consumo+ " " +peso;
    }












    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
