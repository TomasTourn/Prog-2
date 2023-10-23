package Parciales.Parcial2022;

import Parciales.Parcial2022.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoPE {

    private String categoria;
    private List<String>palabrasClave;



    public ElementoPE(String categoria) {
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
    }


    //metodos
    public void addPalabraClave(String p){
        if (p!=null && !palabrasClave.contains(p))
            palabrasClave.add(p);
    }
    public String getCategoria() {
        return categoria;
    }
    public List<String>getPalabrasClave(){
        return new ArrayList<>(palabrasClave);//copia de palabrasClave
    }

    public abstract List<Noticia>buscarNoticias(Buscador b);

    public abstract void agregarPalabra(AgregadorPalabras a);


}
