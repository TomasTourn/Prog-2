package TP_5.Ejercicio5;

public class Venta {

    private int nroVenta;
    private double monto;

    public Venta(int nroVenta, double monto) {
        this.nroVenta = nroVenta;
        this.monto = monto;
    }

    public boolean equals(Object o){
        Venta v= (Venta) o;
        try {
            return v.nroVenta==this.nroVenta;//se supone q el id es unico
        }catch (Exception exc){
            return false;
        }
    }


    public int getNroVenta() {
        return nroVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
