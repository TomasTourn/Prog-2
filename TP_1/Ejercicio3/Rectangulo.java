package TP_1.Ejercicio3;

import org.w3c.dom.css.Rect;

public class Rectangulo {


    //atributos
    private PuntoGeometrico p1;
    private PuntoGeometrico p2;
    private PuntoGeometrico p3;
    private PuntoGeometrico p4;

    public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2,PuntoGeometrico p3,PuntoGeometrico p4){

        // valor en y de p1 y p2 debe ser igual
        // valor en x de p2 y p3 debe ser igual
        // valor en y de p3 y p4 debe ser igual
        // valor en x de p4 y p1 debe ser igual

        //verificacion de que es un rectangulo
        if(p1.getY()==p2.getY() && p2.getX()==p3.getX() && p3.getY()==p4.getY() && p4.getX()==p1.getX()){
            this.setP1(p1);
            this.setP2(p2);
            this.setP3(p3);
            this.setP4(p4);
        }


    }

    //Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e Y.


    public void desplazamientoRectangulo(double x,double y){
        p1.desplazamiento(x,y);
        p2.desplazamiento(x,y);
        p3.desplazamiento(x,y);
        p4.desplazamiento(x,y);
    }

    //Calcular el Área del rectángulo.(base por altura)

    public double base(){
        return p2.getX()-p1.getX();
    }

    public double altura(){
        return p2.getY()-p3.getY();
    }

    public double area(){

       /* double altura = p2.getY()-p3.getY();
        double base = p2.getX()-p1.getX();
        return base*altura;*/
        return  this.base()*this.altura();
    }

    //Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
    //iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
    //del mismo es mayor que la del otro.

    public int compararRectangulo(Rectangulo r2){

        if(r2.area()>this.area()){
            return 1;
        }
        else if(r2.area()==this.area()){
            return 0;
        }
        else{
            return -1;
        }
    }

    //Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
    //propiedades para que sea un cuadrado.

    public boolean esCuadrado(){
        if(this.base()==this.altura()){
            return true;
        }
        return false;
    }


    //Determinar el largo del lado superior.
    public double largoSuperior(){
        return p2.getX()-p1.getX();
        //podria retornar base, es lo mismo
        //return this.base();
    }
    //Determinar si está acostado o parado (si el alto es más que el ancho).
    public String  paradoOacostado(){
        if(this.altura()>this.base()){
            return "esta parado :)";
        }
        else if(this.base()>this.altura()){
            return "esta acostado";
        }
        else{
            return "es cuadrado";
        }
    }


    public PuntoGeometrico getP1() {
        return p1;
    }

    public void setP1(PuntoGeometrico p1) {
        this.p1 = p1;
    }

    public PuntoGeometrico getP2()
    {
        return p2;
    }


    public void setP2(PuntoGeometrico p2) {
        this.p2 = p2;
    }

    public PuntoGeometrico getP3() {
        return p3;
    }

    public void setP3(PuntoGeometrico p3) {
        this.p3 = p3;
    }

    public PuntoGeometrico getP4() {
        return p4;
    }

    public void setP4(PuntoGeometrico p4) {
        this.p4 = p4;
    }
}
