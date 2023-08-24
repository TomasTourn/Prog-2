package TP_2.Ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Turno {

    private int nroTurno;
    private Usuario usuario;
    private Cancha cancha;
    private LocalDateTime fecha;
    private double porcentajeDescuento;


    public Turno(int nroTurno, Usuario usuario, Cancha cancha, LocalDateTime fecha){
        this.setNroTurno(nroTurno);
        this.setUsuario(usuario);
        this.setCancha(cancha);
        this.setFecha(fecha);
        this.setPorcentajeDescuento(10);
        usuario.ActualizarReservas(fecha);

        if(usuario.esSocio()){//si es socio aplica el descuento a la cancha
            this.aplicarDescuento();
        }

    }

    // calculo el porcentaje y despues lo resto al precio original
    public void aplicarDescuento(){

        double descuento=(porcentajeDescuento/100)* cancha.getPrecio();
        cancha.setPrecio(cancha.getPrecio()-descuento);
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
}
