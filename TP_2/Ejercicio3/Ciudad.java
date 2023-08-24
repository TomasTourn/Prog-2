package TP_2.Ejercicio3;

public class Ciudad {

    private String nombre;
    private int habitantes;
    private Impuesto[]impuestos;
    private int gastosMantenimiento;


    public Ciudad (String nombre, int habitantes,int cantImpuestos,int gastosMantenimiento){

        this.setNombre(nombre);
        this.setHabitantes(habitantes);
        this.impuestos=new Impuesto[cantImpuestos];
        this.setGastosMantenimiento(gastosMantenimiento);


    }


    public void agregarImpuesto(Impuesto impuesto, int pos){

        if(impuesto != null && impuestos[pos]== null && pos>=0 && pos<impuestos.length){
            impuestos[pos]=impuesto;
        }
    }

    public void editarImpuesto(Impuesto impuesto,int pos){

        if(impuesto != null && impuestos[pos]!= null && pos>=0 && pos<impuestos.length){
            impuestos[pos]=impuesto;
        }
    }


    public boolean tieneDeficit(){

        double recaudacionImpuestos=0;


        for (Impuesto impuesto : impuestos) {

            if (impuesto != null) {
                recaudacionImpuestos += impuesto.getMontoRecaudado();
            }
        }
        return recaudacionImpuestos<gastosMantenimiento;// si la recaudacion de impuestos es mayor a los gastos de mantenimiento entonces hay deficit

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

       public int getGastosMantenimiento() {
        return gastosMantenimiento;
    }

    public void setGastosMantenimiento(int gastosMantenimiento) {
        this.gastosMantenimiento = gastosMantenimiento;
    }

}
