package TP_5.Ejercicio5;

public class EmpleadoConBono extends EmpleadoConExtra{

    private double bono;
    private double ventasNecesariasBono;
    public EmpleadoConBono(String nombre, String apellido, int dni, double sueldo,double extraPorVentas,double bono,double ventasNecesariasBono){
        super(nombre, apellido, dni, sueldo, extraPorVentas);
        this.bono=bono;
        this.ventasNecesariasBono=ventasNecesariasBono;
    }

    @Override
    public double getSueldo(){
        if(ventasNecesariasBono>=ventas.size()){
            return super.getSueldo()+bono;
        }
        else{
            return super.getSueldo();
        }
    }

}
