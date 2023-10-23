package Parciales.Parcial2022;

import Parciales.Parcial2022.Buscadores.Buscador;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ElementoPE{

   private List<ElementoPE>elementos;
   private int posCategoria;
   private static final String CATPROVISORIA="Sin definir";
   private List<AgregadorPalabras> agregadorPalabras;
    public Coleccion(int posCategoria) {
        super(CATPROVISORIA);//provisorio
        this.posCategoria=posCategoria;
        this.elementos = new ArrayList<>();
        this.agregadorPalabras=new ArrayList<>();
    }


    public void addElemento(ElementoPE e){
        if(e!=null &&!elementos.contains(e))
            elementos.add(e);
    }
    public void addAgregadorPalabras(AgregadorPalabras a){
        if(a!=null && !agregadorPalabras.contains(a))
            agregadorPalabras.add(a);
    }
    @Override
    public String getCategoria() {

        for (int i=0;i<elementos.size();i++) {
            if(i==posCategoria){
                return elementos.get(posCategoria).getCategoria();
            }
        }
        return CATPROVISORIA;

    }

    @Override
    public List<String> getPalabrasClave() {

        List<String>pClaves=new ArrayList<>();

        for (ElementoPE e:elementos) {
            for (String p:e.getPalabrasClave()) {//me traigo las palabras clave de una noticia y las recorro
                    if (!pClaves.contains(p))//si todavia no la tengo la agrego
                            pClaves.add(p);
            }
        }
        return pClaves;
    }

    @Override
    public List<Noticia> buscarNoticias(Buscador b) {
        List<Noticia> noticias = new ArrayList<>();

        for (ElementoPE e : elementos) {
            noticias.addAll(e.buscarNoticias(b));
        }
        return noticias;
    }

    @Override
    public void agregarPalabra(AgregadorPalabras a) {
        for (ElementoPE e:elementos) {
            e.agregarPalabra(a);
        }
    }


}
