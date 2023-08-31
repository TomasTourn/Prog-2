package TP_4.Ejercicio6;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jerarquico extends Empleado {

    private List<Empleado>empleadosACargo;
    public Jerarquico(String nombre, String apellido, LocalDate fechaNacimiento, int nroLegajo, double sueldo){
        super(nombre,apellido,fechaNacimiento,nroLegajo,sueldo);
        this.empleadosACargo=new ArrayList<Empleado>();
    }
    public void agregarEmpleado(Empleado e){
        if(e!=null){
            empleadosACargo.add(e);
        }
    }

    @Override
    public String toString(){
        String datos=super.toString()+ "\nEmpleados a cargo: ";
        for (Empleado e:empleadosACargo) {
           datos+="\n"+e.getNombre();
        }
        return datos;
    }
    
    public void mostrarEmpleados(){
        for (Empleado e:empleadosACargo) {
            System.out.println(e.getNombre());
        }
    }




}
