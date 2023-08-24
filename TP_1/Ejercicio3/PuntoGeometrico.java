package TP_1.Ejercicio3;
import  java.lang.Math;

public class PuntoGeometrico {

    private double x;
    private double y;


    public PuntoGeometrico(){
        this(0);
    }
    public PuntoGeometrico(double x){
        this(x,0);
    }
    public PuntoGeometrico(double x,double y){
        this.setX(x);
        this.setY(y);
    }
    //metodos

    //desplazamiento en x e y
    public void desplazamiento(double x,double y){
        this.setX(this.x+x);
        this.setY(this.y+y);
    }
    //euclidea, hago la formula cuando los valores en x e y que me pasan por parametro, y los que tengo en el objeto
    public double euclidea(double x,double y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));//pow eleva al numero despues de la coma y sqrt calcula la raiz cuadrada
    }
    public String toString(){
        return "x:" + this.getX() +"  y:" + this.getY();
        //return "x:" + x +"  y:" + y;
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
