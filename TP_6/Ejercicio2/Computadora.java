package TP_6.Ejercicio2;

public class Computadora extends Elemento{

    private String nombre;
    private double velocidadCpu;
    private Proceso proceso;
    public Computadora(String nombre,double velocidadCpu){
        this.nombre=nombre;
        this.velocidadCpu=velocidadCpu;
    }
    @Override
    public boolean esMayor(Elemento e){
        Computadora c= (Computadora) e;// se castea para poder usar metodo computadora
        return getVelocidadCpu()>c.getVelocidadCpu();
    }

    public void ejecutarProceso(Proceso p){
        this.proceso=p;
    }

    public String toString(){
        return "Computadora {nombre: "+nombre +
                " velocidad: "+velocidadCpu+
                " ejecutando: "+proceso+
                "}";
    }
    public double getVelocidadCpu() {
        return velocidadCpu;
    }

    public void setVelocidadCpu(double velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
    }
}
