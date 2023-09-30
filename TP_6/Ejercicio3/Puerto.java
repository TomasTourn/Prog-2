package TP_6.Ejercicio3;

public class Puerto {


    private ColaEsperaBarco colaBarco;
    private ColaEsperaCamion colaCamion;

    public Puerto(ColaEsperaBarco c1,ColaEsperaCamion c2){
        this.colaBarco=c1;
        this.colaCamion=c2;
    }
    public void IntercambioCereal(){

        while(colaBarco.hayElementos()&&colaCamion.hayElementos()){
            ((Barco)colaBarco.getPrimera()).cargar();
            ((Camion)colaCamion.getPrimera()).descargar();
            this.colaBarco.borrarPrimera();
            this.colaCamion.borrarPrimera();
        }

    }




}
