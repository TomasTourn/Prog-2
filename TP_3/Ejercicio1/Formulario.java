package TP_3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Formulario {

    private int idFormulario;
    private List<String>preguntas;



    public Formulario(int idFormulario){
        this.idFormulario=idFormulario;
        this.preguntas=new ArrayList<String>();
    }

    public void agregarPregunta(String pregunta){
        if(pregunta!=null){
            this.preguntas.add(pregunta);
        }

    }

    public int getIdFormulario() {
        return idFormulario;
    }
}
