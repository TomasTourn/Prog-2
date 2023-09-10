package TP_5.Libreria;

import java.util.ArrayList;

public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, int dni, String direccion,double descuento) {
      super(nombre, dni, direccion, descuento);
    }
    @Override
    public boolean leGusta(Articulo a){

        if(super.leGusta(a)){
            for (String g:a.getGeneros()) {
                if(generosFav.contains(g)){
                  return true;
                }
            }
            return false;
        }
        return false;
    }

}
