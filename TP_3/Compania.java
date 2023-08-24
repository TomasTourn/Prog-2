package TP_3;

import java.util.ArrayList;
import java.util.List;

public class Compania {

    private String nombreCompania;
    private List<FormularioRespondido>formularioRespondidos;
    private List<Encuesta>encuestas;
    private List<Empleado>empleados;



    public Compania(String nombreCompania){
        this.setNombreCompania(nombreCompania);
        this.formularioRespondidos=new ArrayList<FormularioRespondido>();
        this.encuestas=new ArrayList<Encuesta>();
        this.empleados=new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado empleado){
        if(empleado!=null){//podria hacer un for each para checkear que el empleado no exista pero bueno asumo que no van a cargar 2 veces el mismo
            this.empleados.add(empleado);
        }
    }



    public int cantidadEncuestasEmpleado(Empleado empleado){
        return  empleado.getEncuestasRealizadas();
    }

    public void agregarEncuesta(Encuesta encuesta){
        //tengo que checkear que la persona no haya sido encuestada antes
        boolean fueEncuestado=false;

        for (FormularioRespondido f:formularioRespondidos) {

            if(f.getDni()==encuesta.getEncuestado().getDni()){

                if(encuesta.getFormulario().getIdFormulario()==f.getIdFormulario());
                // si el dni coincide el booleano cambia a true y no agrego la encuesta
                fueEncuestado=true;
                System.out.println("la persona ya fue encuestada anteriormente");

            }
        }

        if(fueEncuestado==false){
            formularioRespondidos.add(encuesta.getFormularioRespondido());
            encuestas.add(encuesta);
            for (Empleado e:empleados) {
                if(e.getNombre().equals(encuesta.getEmpleado().getNombre()) && e.getIdEmpleado()==encuesta.getEmpleado().getIdEmpleado()){//equals es lo mismo que == pero para strings en este caso
                    e.sumarEncuesta();

                }
            }
        }

    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }
}
