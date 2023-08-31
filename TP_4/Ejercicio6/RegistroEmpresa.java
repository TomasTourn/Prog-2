package TP_4.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class RegistroEmpresa {

    private List<Persona>personal;

    public RegistroEmpresa(){
        this.personal=new ArrayList<Persona>();
    }


    public void agregarPersonal(Persona p){
        if(p!=null){
            personal.add(p);
        }

    }
    public String toString(){

        String persona="Personal de la Empresa:\n";


        for (Persona p:personal) {
           persona+="\n" +p.toString()+"\n-------------------------------------------------";

        }


        return persona;

    }


}
