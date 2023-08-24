package TP_2.Ejercicio3;

public class Pais {

    private String nombre;
    private Provincia[]provincias;

    public Pais(String nombre,int cantProvincias){
        this.setNombre(nombre);
        this.provincias=new Provincia[cantProvincias];
    }


    public void agregarProvincia(Provincia provincia, int pos){

        if(provincia != null && provincias[pos]== null && pos>=0 && pos<provincias.length){
            provincias[pos]=provincia;
        }
    }

    public void editarProvincia(Provincia provincia, int pos){

        if(provincia != null && provincias[pos]!= null && pos>=0 && pos<provincias.length){
            provincias[pos]=provincia;
        }
    }


    public int ProvinciasEnDeficit(){

        int provinciasEnDeficit=0;

        for (Provincia provincia:provincias) {
            System.out.println(provincia.getNombre());
           if(provincias!=null && provincia.mitadEnDeficit()){
                   provinciasEnDeficit++;
           }

        }
        return provinciasEnDeficit;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
