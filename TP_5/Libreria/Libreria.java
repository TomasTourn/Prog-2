package TP_5.Libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private String nombre;
    private List<Cliente> clientes;
    private List<Articulo> articulos;

    public Libreria(String nombre){
        this.nombre=nombre;
        clientes=new ArrayList<>();
        articulos=new ArrayList<>();
    }

    public double getPrecioCliente(Articulo a,Cliente c){
        return a.getPrecio()-(a.getPrecio()*c.getDescuento());
    }

    public List<Cliente> listaClientes(Articulo a){

        List<Cliente>listado=new ArrayList<>();
        for (Cliente c:clientes) {
            if (c.leGusta(a)){
                listado.add(c);
            }
        }
        return listado;
    }


}
