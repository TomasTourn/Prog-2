package TP_4.Ejercicio5;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(String nombre,LocalDate fechaVencimiento,int nroLote,LocalDate fechaEnvasado,String granjaOrigen){
        super(nombre, fechaVencimiento, nroLote);
        this.fechaEnvasado=fechaEnvasado;
        this.granjaOrigen=granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString(){
        return super.toString()+ " Fecha Envasado: "+fechaEnvasado+ " Granja Origen: "+granjaOrigen;
    }


}
