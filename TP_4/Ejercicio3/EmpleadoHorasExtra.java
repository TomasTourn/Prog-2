package TP_4.Ejercicio3;

public class EmpleadoHorasExtra extends Empleado {

    public int horasExtra;
    public double extraPorHora;
    public EmpleadoHorasExtra(String nombre,int legajo,double sueldo,int horasExtra,double extraPorHora){
        super(nombre,legajo,sueldo);
        this.horasExtra=horasExtra;
        this.extraPorHora=extraPorHora;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getExtraPorHora() {
        return extraPorHora;
    }

    public void setExtraPorHora(double extraPorHora) {
        this.extraPorHora = extraPorHora;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo()+(this.getExtraPorHora()*this.getHorasExtra());
    }
}
