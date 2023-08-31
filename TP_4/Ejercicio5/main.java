package TP_4.Ejercicio5;

import java.time.LocalDate;

public class main {
    /*
    * avicola
    *   clase padre Producto.
    *   3 tipos de productos
    *
    * ProductoFresco:
    * fecha de envasado y granja de origen.
    *
    *
    Sa* ProductoRefrigerado: (hija de ProductoFresco) // uso solo ProductoRefrigerado ya que producto congelado tiene los mismos atributos y seria repeticion de codigo
    *       código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento
            recomendada y la granja de origen
    *
    *

    * los productosCongelados se dividen en 3, deberian ser clases hijas de ProductoRefrigerado
    *
    *
    * CongeladoPorAire:
    *       composicion del aire (% de nitrógeno, % de oxígeno, % de dióxido
            de carbono y % de vapor de agua).
    *
    *
    * CongeladoPorAgua:
    *       información de la salinidad del agua con que se realizó la congelación en gramos de sal por
            litro de agua.
    *
    *
    * CongeladoPorNitrogeno:
    *       información del método de congelación empleado y del tiempo de exposición
    *       al nitrógeno expresada en segundos.
    *
    * */

    public static void main(String[] args) {

        Producto p1= new Producto("leche", LocalDate.of(2023,9,15),66);
        Producto pf1= new ProductoFresco("huevo", LocalDate.of(2023,9,11),67,LocalDate.of(2023,8,11),"granja pampeana");
        Producto pr1= new ProductoRefrigerado("pollo fresco", LocalDate.of(2023,9,11),67,LocalDate.of(2023,8,11),"granja pampeana",873843298,5);
        Producto pcAgua= new CongeladoConAgua("Hamburguesa", LocalDate.of(2023,9,11),67,LocalDate.of(2023,8,11),"granja pampeana",873843298,5,20);
        Producto pcAire= new CongeladoConAire("papas fritas", LocalDate.of(2023,9,11),67,LocalDate.of(2023,8,11),"granja pampeana",873843298,5,20,10,15,30,40);
        Producto pcNitrogeno= new CongeladoConNitrogeno("granos de maiz", LocalDate.of(2023,9,11),67,LocalDate.of(2023,8,11),"granja pampeana",873843298,5,"pistola de nitrogeno",2);
        System.out.println(p1);
        System.out.println(pf1);
        System.out.println(pr1);
        System.out.println(pcAgua);
        System.out.println(pcAire);
        System.out.println(pcNitrogeno);
    }
}
