package TP_2.Ejercicio4;

public class Establecimiento {

    private String nombre;
    private Turno[] turnos;
    private Usuario[] socios;

    public Establecimiento(String nombre,int cantTurnos,int cantSocios){
        this.setNombre(nombre);
        this.turnos= new Turno[cantTurnos];
        this.socios= new Usuario[cantSocios];
    }

    public void agregarTurno(Turno turno,int pos){

        if(turno != null && turnos[pos]== null && pos>=0 && pos<turnos.length){
            turnos[pos]=turno;
        }

    }
    public void editarTurno(Turno turno,int pos){

        if(turno != null && turnos[pos]!= null && pos>=0 && pos<turnos.length){
            turnos[pos]=turno;
        }

    }
    public void agregarSocio(Usuario socio,int pos){

        if(socio != null && socios[pos]== null && pos>=0 && pos<socios.length){
            socios[pos]=socio;
        }

    }
    public void editarSocio(Usuario socio,int pos){

        if(socio != null && socios[pos]!= null && pos>=0 && pos<socios.length){
            socios[pos]=socio;
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
