package TP_6.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaAlquiler {

    private List<Alquiler>alquileres;
    private List<Cliente>clientes;


    public SistemaAlquiler(){
        alquileres=new ArrayList<>();
        clientes=new ArrayList<>();
    }
    public void agregarAlquiler(Alquiler a){
        if(!alquileres.contains(a) && a!=null){
            alquileres.add(a);
            agregarCliente(a.getCliente());//al agregar un alquiler tambien agrego el cliente en caso de que sea nuevo

        }
    }
    public void agregarCliente(Cliente c){
        if(!clientes.contains(c) && c!=null){
            clientes.add(c);
        }
    }

    public List<Cliente> ListarVencidos(){
        List<Cliente>clientesVencidos=new ArrayList<>();

        for (Alquiler a:alquileres) {
            if(alquilerVencido(a)){
                clientesVencidos.add(a.getCliente());//si el alquiler esta vencido agrego al cliente a la lista
            }
        }
        return clientesVencidos;
    }

    public boolean alquilerVencido(Alquiler a){
        return LocalDate.now().isAfter(a.getFechaFin());

    }

}
