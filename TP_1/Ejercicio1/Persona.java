package TP_1.Ejercicio1;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;
    private LocalDate fechaActual= LocalDate.now();
    private int mayor=18;
    private int aptoVotacion=16;

    //metodos

    public String getData(){
        return nombre+ " " +apellido+ " " +edad+ " " +fechaNacimiento+ " " +dni+ " " +sexo+ " " +peso+ " " +altura;
    }

    public boolean cumpleAnios(){
        //if no es necesario, return hace lo mismo
        //comparo mes y dia actuales con mes y dia del sujeto
        return fechaNacimiento.getMonth()==(fechaActual.getMonth()) &&  fechaNacimiento.getDayOfMonth()==(fechaActual.getDayOfMonth());
    }

    public boolean esMayor(){
        //obtengo el periodo entre la fecha de nacimiento y la actual, extraigo los años y comparo si es mayor a 18
        return Period.between(fechaNacimiento,fechaActual).getYears()>=mayor;
    }
    public boolean puedeVotar(){
        return Period.between(fechaNacimiento,fechaActual).getYears()>=aptoVotacion;
    }

    public boolean edadCoherente(){
        return Period.between(fechaNacimiento,fechaActual).getYears()==edad;
    }

    public double imc(){
        return peso / (altura*altura);
    }
    public boolean enForma(){
        return this.imc() > 18.5 && this.imc() < 25;
    }

    //constructores
    public Persona(int dni,String nombre,String apellido, int edad,LocalDate fechaNacimiento,String sexo,double peso,double altura){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setFechaNacimiento(fechaNacimiento);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }
    public Persona(int dni){
        this(dni,"N","N",1,LocalDate.parse("2000-01-01"),"Femenino",1,1);

    }

    public Persona(int dni,String nombre){
        this(dni,nombre,"N",1,LocalDate.parse("2000-01-01"),"Femenino",1,1);
    }
    public Persona(int dni,String nombre,String apellido){
        this(dni,nombre,apellido,1,LocalDate.parse("2000-01-01"),"Femenino",1,1);
    }
    public Persona(int dni,String nombre,String apellido,int edad){
        this(dni,nombre,apellido,edad,LocalDate.parse("2000-01-01"),"Femenino",1,1);
    }
    public Persona(int dni,String nombre,String apellido,int edad,LocalDate fechaNacimiento){
        this(dni,nombre,apellido,edad,fechaNacimiento,"Femenino",1,1);
    }
    public Persona(int dni,String nombre,String apellido,int edad,LocalDate fechaNacimiento,String sexo){
        this(dni,nombre,apellido,edad,fechaNacimiento,sexo,1,1);
    }
    public Persona(int dni,String nombre,String apellido,int edad,LocalDate fechaNacimiento,String sexo,double peso){
        this(dni,nombre,apellido,edad,fechaNacimiento,sexo,peso,1);
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
