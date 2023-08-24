package TP_1.Ejercicio3;

public class Rectangulo2 {

    //en esta clase el vertice hace referencia al punto superior izquierdo
    private PuntoGeometrico vertice;
    private double ancho;
    private double alto;

    public Rectangulo2(PuntoGeometrico vertice,double ancho, double alto){
        this.setVertice(vertice);
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public void desplazamientoRectangulo(double x,double y){
        this.vertice.desplazamiento(x,y);
    }

    public double area(){
        return ancho*alto;
    }
    public int comparacion(Rectangulo2 r2){
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

    public boolean esCuadrado(){
        if(this.ancho==this.alto){
            return true;
        }
        return false;
    }
    public double largoLadoSuperior(){
        return ancho;
    }
    public String paradoOacostado(){
        if(this.alto>this.ancho){
            return "esta parado";
        }

        else if(this.ancho>this.alto){
            return "esta acostado";
        }
        else{
            return "es cuadrado";
        }
    }


    public PuntoGeometrico getVertice() {
        return vertice;
    }

    public void setVertice(PuntoGeometrico vertice) {
        this.vertice = vertice;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
