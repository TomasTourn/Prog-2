package TP_2.Ejercicio4;

public class Cancha {

    private String tipoCancha;
    private double precio;
    private double precioPaddle;
    private double precioFutbol5;

    public Cancha(String tipoCancha){

        this.setTipoCancha(tipoCancha);
        this.setPrecioPaddle(100);
        this.setPrecioFutbol5(400);

        if(tipoCancha.toLowerCase() =="futbol 5"){
            this.setPrecio(precioFutbol5);
        } else if (tipoCancha.toLowerCase() =="paddle") {
            this.setPrecio(precioPaddle);
        }

    }

    public Cancha(String tipoCancha,int precio){
        this.setTipoCancha(tipoCancha);
        this.setPrecio(precio);
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioPaddle() {
        return precioPaddle;
    }

    public void setPrecioPaddle(double precioPaddle) {
        this.precioPaddle = precioPaddle;
    }

    public double getPrecioFutbol5() {
        return precioFutbol5;
    }

    public void setPrecioFutbol5(double precioFutbol5) {
        this.precioFutbol5 = precioFutbol5;
    }
}
