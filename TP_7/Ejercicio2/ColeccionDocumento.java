package TP_7.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDocumento {

    private String nombreColeccion;
    private List<Documento> documentos;

    public ColeccionDocumento(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        documentos=new ArrayList<>();
        }

    public void addDocumento(Documento d){
        if(d!=null && !documentos.contains(d))
            documentos.add(d);
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
}
