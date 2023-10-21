package TP_9.EjercicioFilmina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equipo extends ElementoEmpresa {

    private String nombre;
    private List<ElementoEmpresa> elementos;


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.elementos=new ArrayList<>();
    }
    public void addElemento(ElementoEmpresa e){
        if(!elementos.contains(e))
            elementos.add(e);
    }

    public String getEspecialidad() {

            String especialidadEquipo="";
            int cantEspecialidadesMayor=0;

        for (ElementoEmpresa e:elementos) {


            String espEmpleado=e.getEspecialidad();
            int cantPorEspecialidad=e.cantEmpleadosxEspecialidad(espEmpleado);//trae la cantidad de empleados por la especialidad del empleado en concreto


            if(cantPorEspecialidad>cantEspecialidadesMayor){ //mantiene actualizada la especialidad con mas empleados

                cantEspecialidadesMayor=cantPorEspecialidad;
                especialidadEquipo=espEmpleado;

            }

        }
    return especialidadEquipo;

    }

    /*

    FALOPA CON MAP,ANDA EN LOS GRUPOS PERO SE ROMPE SI TENES UNA SUCURSAL CON VARIOS GRUPOS

    public String getEspecialidad(){
        //creo un mapa
        Map<String,Integer> mapaEspecialidades= new HashMap<>();// basicamente es como un arreglo pero por cada string tambien tenes un integer.


        for (ElementoEmpresa e:elementos) {

            if (mapaEspecialidades.containsKey(e.getEspecialidad())){
                mapaEspecialidades.put(e.getEspecialidad(),mapaEspecialidades.get(e.getEspecialidad())+1);// le agrego uno al valor de esa especialidad
            }
            else {
                mapaEspecialidades.put(e.getEspecialidad(),1);//si aun no existe la creo
            }
        }
        
        int cantEspecialidadesMayor=0;
        String especialidadGrupo="";

        for (Map.Entry<String,Integer> m:mapaEspecialidades.entrySet()) {
            if (m.getValue()>cantEspecialidadesMayor){
                cantEspecialidadesMayor=m.getValue();
                especialidadGrupo=m.getKey();
            }
        }

        return especialidadGrupo;
        
    }

     */
    public int cantEmpleadosxEspecialidad(String especialidad){
        int cantTotal=0;
        for (ElementoEmpresa e:elementos) {
            cantTotal+=e.cantEmpleadosxEspecialidad(especialidad);
        }
        return cantTotal;
    }

    public List<Empleado> empleadosPorEspecialidad(String especialidad){

        List<Empleado>empleados=new ArrayList<>();

        for (ElementoEmpresa e:elementos) {
            empleados.addAll(e.empleadosPorEspecialidad(especialidad));
        }

        return empleados;
    }


}
