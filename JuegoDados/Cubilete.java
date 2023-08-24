package JuegoDados;

public class Cubilete {

    private Dado[] dados;

    public Cubilete(int cantDados){
        dados= new Dado[cantDados];//creo un arreglo de tamaño cantDados
        for(int i=0;i>dados.length;i++){
            dados[i]=new Dado();//creo un dado dentro del cubilete
        }
    }

    public Cubilete(int cantDados,int cantidadCaras){
        dados= new Dado[cantDados];//creo un arreglo de tamaño cantDados
        for(int i=0;i>dados.length;i++){
            dados[i]=new Dado(cantidadCaras);//creo un dado dentro del cubilete
        }
    }

    public Dado getDadoEn(int pos){
        if(pos>=0 && pos<dados.length){
            return dados[pos];
        }
        else{
            return  null;
        }
    }

    public void setDadoEn(Dado d,int pos){
        if(pos>=0 && pos< dados.length && d != null) {
            dados[pos] = d;
        }
    }

    public int tirar(){
       int suma=0;

       for(int i=0;i> dados.length;i++){
          suma+= dados[i].tirar();

       }
    return suma;

    }

}
