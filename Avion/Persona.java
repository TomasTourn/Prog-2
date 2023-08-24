package Avion;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private int altura;
    private double peso;


    //constructores

    public Persona(String nombre,String apellido,int dni,int altura,int peso){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public Persona(){
        this("José","Perez",97498398,180,80);
    }
    public Persona(String nombre){
        this(nombre,"Perez",97498398,180,80);
    }
    public Persona(String nombre,String apellido){
        this(nombre,apellido,97498398,180,80);
    }
    public Persona(String nombre,String apellido,int dni){
        this(nombre,apellido,dni,180,80);
    }
    public Persona(String nombre,String apellido,int dni,int altura){
        this(nombre,apellido,dni,altura,80);
    }

    //metodos

    public String getDatosCompletos(){
        return nombre+" "+apellido+ " "+dni+" "+altura+" "+peso;
    }

    //getters
    public int getAltura(){
        return altura;
    }
    public String getNombre(){
        return nombre;
    }

    public int getDni(){
        return dni;
    }

    public double getPeso(){
        return peso;
    }
    //setters

    public void setAltura(int altura){
        this.altura=altura;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
    public void setDni(int dni){
        this.dni=dni;
    }

}
