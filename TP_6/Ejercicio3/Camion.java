package TP_6.Ejercicio3;

import java.time.LocalDate;

public class Camion {

    private LocalDate fechaCarga;


    public Camion(LocalDate fechaCarga){
        this.fechaCarga=fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

  public void descargar(){
      System.out.println("descargando camion cargado en: "+fechaCarga);
  }
}
