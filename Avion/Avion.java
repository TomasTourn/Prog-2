package Avion;

public class Avion {

    // atributos

    private int capacidad;
    private String modelo;
    private String color;
    private Persona duenio;




    //constructor

    public Avion(int cap,String co,String mod,Persona du){
        this.setCapacidad(cap);
        this.setColor(co);
        this.setModelo(mod);
        this.setDuenio(du);
    }
    public Avion(){
        this(100,"blanco","BI",null);
    }
    public Avion(int cap){
        this(cap,"blanco","BI",null);
    }
    public Avion(int cap,String co){
        this(cap,co,"BI",null);
    }
    public Avion(int cap,String co,String mod){
        this(cap,co,mod,null);
    }


    /*
    public Avion(){
        capacidad = 100;
        color = "blanco";
        modelo = "BI";
    }
*/
    public String getColor(){
        return color;
    }

    public void setColor(String nuevoColor){
            color=nuevoColor;

    }
    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad>0){
            this.capacidad = capacidad;
        }
    }
}
