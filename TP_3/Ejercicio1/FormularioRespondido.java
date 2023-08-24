package TP_3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class FormularioRespondido {

    private Persona encuestado;
    private List<String> respuestas;
    private int idFormulario;

    public FormularioRespondido(Persona encuestado, int idFormulario){
        this.encuestado=encuestado;
        this.idFormulario=idFormulario;
        this.respuestas=new ArrayList<String>();
    }

    public void agregarRespuesta(String respuesta){

        if(respuesta!=null){
            respuestas.add(respuesta);
        }

    }

    public Persona encuestado() {
        return encuestado;
    }

    public int getDni(){
        return encuestado.getDni();
    }

    public void setEncuestado(Persona encuestado) {
        this.encuestado = encuestado;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }
}
